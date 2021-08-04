//Allyson Davis
//Exercise_14.5
//BuildSentence.java

public class BuildSentence {
    public static void main(String args[]) {
        //Creating a Sentence object
        Sentence sentence;
 
        //Printing 20 statements
        for(int i=1; i<=20; i++) {
            //Creating instance
            sentence = new Sentence();
       
            //Printing sentence created
            System.out.println(sentence.getSentence());
        }  
    }//end main
}//end class
