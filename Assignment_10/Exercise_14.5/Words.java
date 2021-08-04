//Allyson Davis
//Exercise_14.5
//Words.java

import java.util.*;

public class Words {
    private Random rand;
    private String[] article;
    private String[] noun;
    private String[] verb;
    private String[] preposition;

    public Words() {
        //create Random object
        rand = new Random();

        //initialize arrays
        article = new String[] {"the", "a", "one", "some", "any"};
        noun = new String[] {"boy", "girl", "dog", "town", "cat"};
        verb = new String[] {"drove", "jumped", "ran", "walked", "skipped"};
        preposition = new String[] {"to", "from", "over", "under", "on"};
    }//end constructor

    public String getArticle() {
        int r = rand.nextInt(5);
        return article[r];
    }//end getArticle

    public String getNoun() {
        int r = rand.nextInt(5);
        return noun[r];
    }//end getNoun

    public String getVerb() {
        int r = rand.nextInt(5);
        return verb[r];
    }//end getVerb

    public String getPreposition() {
        int r = rand.nextInt(5);
        return preposition[r];
    }//end getPreposition

}//end class