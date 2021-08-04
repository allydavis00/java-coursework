//Allyson Davis
//Exercise_14.5
//Sentence.java

import java.util.*;

public class Sentence {
    private Words word;

    public Sentence() {
        word = new Words();
    }//end constructor

    public String getSentence() {
        String str = word.getArticle() + " " + word.getNoun() + " " + word.getVerb() + " " + word.getPreposition() + " " + word.getArticle() + " " + word.getNoun();
      
       //Making first character upper and adding period at last
       str = str.substring(0, 1).toUpperCase()+str.substring(1)+".";

       return str;
    }//end getSentence
}//end class