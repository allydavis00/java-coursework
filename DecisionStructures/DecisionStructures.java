
public class DecisionStructures {
    public static void main(String[] args) {
        System.out.println("Developer: Allyson Davis");
        System.out.println("Program eveluates user-entered characters.");
        System.out.println("Use following characters: W or w, C or c, H or h, N or n.");
        System.out.println("Use following decision structures: if...else, and switch.\n");

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Phone types: W or w (work), C or c (cell), H or h (home), N or n (none).");
        System.out.print("Enter Phone type: ");
        char choice = scnr.next().charAt(0);

    }//end main
}