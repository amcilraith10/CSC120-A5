/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * Prints ASCII Art pants (I drew them!)
     */
    public void display() {
        System.out.println("        ============");
        System.out.println("       |||||||o||||||");
        System.out.println("       /      |.    \\");
        System.out.println("      /       |.     \\");
        System.out.println("     /        |.      \\");
        System.out.println("    |         |         |");
        System.out.println("    |________/\\________|");                          
    }
 
        /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
