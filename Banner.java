/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
import java.util.Scanner; 

public class Banner {
    private String message;

    /* Message to print on Banner */
    public static void printThisBannerPleaseGod(){
        Scanner message = new Scanner(System.in);
        System.out.println("Enter banner message: ");
        message.close();
    }

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Prints a decorative banner
     */
    public void display() {
        System.out.println("⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘");
        System.out.println("⚘⚘⚘  " + this.message + "   ⚘⚘⚘");
        System.out.println("⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘⚘");
    
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        printThisBannerPleaseGod();
        Banner myBanner = new Banner("Happy fall, Smithies!");
        myBanner.display();
    }
}
