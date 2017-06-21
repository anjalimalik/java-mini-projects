import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 * Created by anjalimalik
 */
public class Parser extends Object{

    public Document getDocument(String url) throws ParseException {

        if(url == null) {
            throw new ParseException("getDocument() failed. String url is null.");
        } else if (url.equals("")) {
            throw new ParseException("getDocument() failed. String url is empty.");
        }

        Document d = null;

        try {
            d = Jsoup.connect(url).get();
        } catch (Exception e) {
            throw new ParseException("getDocument() failed. Connection failed.");
        }

        if(d == null) {
            throw new ParseException("getDocument() failed: Document is null.");

        }
        return d;

    }


    public Elements getLinks(Document doc) throws ParseException {

        if(doc == null){
            throw new ParseException("getLinks() failed. Document parameter is null.");
        }

        Elements links;
        //try {
        links = doc.select("a[href]");
        //} catch (NullPointerException e) {
        //    throw new ParseException("getLinks() failed. Document parameter is null.");
        //}

        return links;
    }

    public String getBody(Document doc) throws ParseException {

        if(doc == null) {
            throw new ParseException("getBody() failed. Document parameter is null.");
        }

        Element body = null;
        //try {
        body = doc.body();
        //} catch (NullPointerException e) {
        //    throw new ParseException("getBody() failed. Document parameter is null.");
        //}

        String content = body.text();
        return content;
    }

}
