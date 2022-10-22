/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * Prints ASCII art of smithie scarecrow shirt (art modified from ASCII Art Archive)
     */
    public void display() {
        System.out.println("        __         __");
        System.out.println("       .'\\ '-.__.-' /'.");
        System.out.println("     //  |a century |   \\");
        System.out.println("    //   | of women |    \\");
        System.out.println("     '-._/  on top  |_.-'");
        System.out.println("         |          |");
        System.out.println("         |          |");
        System.out.println("         '.________.'");
    }

    /* main method (for testing) */

    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}




     