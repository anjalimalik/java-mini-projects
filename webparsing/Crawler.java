import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;

import java.lang.Object;

/**
 * Created by anjalimalik 
 */
public class Crawler extends Object{
    static int currentID;
    static String domain;
    static int limit;
    static List<Page> parsed;
    static Parser parser;
    MyQueue	toParse;
    static int totalURLs;
    static List<String> visited;
    static List<Word> words;



    public Crawler(String seed, String domain, int limit) {

        currentID = 0;
        this.domain = domain;
        this.limit = limit;
        parsed = new ArrayList<Page>();
        parser = new Parser();
        toParse = new MyQueue();
        this.toParse.add(seed); //enqueue seed
        totalURLs = 0;
        //visited = new ArrayList<String>(); //optional list of deleted urls
        words = new ArrayList<Word>();

    }

    public void crawl(){

        try{
            for (int i = currentID; i <= limit; ++i) {
                if (!toParse.isEmpty()) {
                    Node node = toParse.remove();
                    Object data = node.getData();
                    String url = data.toString();
                    if (isValidURL(url) && isInDomain(url)) {
                        Document doc = parser.getDocument(url);
                        if (parse(doc, currentID)) {
                            Page page = new Page(url, currentID);
                            ++currentID;
                            addPageToList(page);
                        }
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean parse(Document doc, int id){

        //if (doc == null) {
        //  return false;
        //}
        try{
            parseLinks(doc);
            parseText(doc, id);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        //return false;
    }

    public void parseLinks(Document doc){

        //Elements links = null;
        String url = null;

        try{
            Elements links = parser.getLinks(doc);
            for(Element link : links) {
                url = link.attr("href" );
                //toParse.add(url);
                addToQueue(url);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void parseText(Document doc, int id){

        String text = null;

        try{
            text = parser.getBody(doc);
            for(String word : (text.split("\\s"))) {
                addWordToList(word, id);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addWordToList(String word, int id){

        String wordlc = word.toLowerCase();
        Word w = new Word(wordlc, id);
        if(!words.contains(w)) {
            words.add(w);
        }
    }

    public void addToQueue(String url){

        if(!parsed.contains(url)) {
            toParse.add(url);
            ++totalURLs;
        }
    }

    public void addPageToList(Page p){
        if(!parsed.contains(p)) {
            parsed.add(p);
        }
    }

    public boolean isInDomain(String url){

        if(url.indexOf(domain) > -1){
            return true;
        } else {
            return false;
        }
    }


    public boolean isValidURL(String url){

        if (url.startsWith("http://") || url.startsWith("https://")) {
            return true;
        } else {
            return false;
        }
    }

}
