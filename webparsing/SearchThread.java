
public class SearchThread extends Object implements Runnable {
    public int finish;
    public int start;
    public String[] terms;

    SearchThread(int start, int finish, String[] terms) {
        this.start = start;
        this.finish = finish;
        this.terms = terms;
    }

    public Word findTerm(String term) {
        boolean check = false;
        int pos = 0;
        for (int j = this.start; j < this.finish; j++) {
            //for(int a=0; a<=Search.wordList.size(); a++ ){
            if (Search.wordList.get(j).getWord().toLowerCase().equals(term)) {
                pos = j;
                check = true;
                break;
            }
        }
        if (check)
            return Search.wordList.get(pos);
         else
            return null;
    }

    public void run() {
        Word obj;
        for (int i = 0; i < this.terms.length; i++) {
            obj = findTerm(terms[i]);
            if (obj != null) {
                for (Integer id : obj.getList()) {
                    if(Search.resultSet.contains(new Result("",id))){
                        Result r = new Result("",id);
                        Search.resultSet.get(Search.resultSet.indexOf(r)).incrementScore();
                    }
                    else{
                        Result r = new Result("",id);
                        Search.resultSet.add(new Result(Search.pageList.get(id).getURL(), Search.pageList.get(id).getURLID()));
                    }
                   // boolean check = false;
                    //int pos = 0;
                   // for (int b = 0; b <= Search.resultSet.size(); b++) {
                   //     if (Search.resultSet.get(b).getURLID() == id) {
                          //  check = true;
                           // pos = b;
                            //Search.resultSet.get(b).incrementScore();
                        //} else {
                         //   check = false;
                      //  }
                    //}
                  //  if (check) {
                      //  Search.resultSet.get(pos).incrementScore();
                   // }
                    //else {
                     //   Search.resultSet.add(new Result(Search.pageList.get(id).getURL(), Search.pageList.get(id).getURLID()));
                        //int p = 0;
                        //String url = "";
                       // for (int a = 0; a < Search.pageList.size(); a++) {
                            //if (Search.pageList.get(a).getURLID()==id.intValue()) {
                                //p = a;
                                //url = Search.pageList.get(a).getURL();
                               // break;
                            //}
                   // }

                }
            }
        }
    }
}
