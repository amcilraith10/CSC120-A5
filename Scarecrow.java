/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * TODO: Uncomment remaining parts as you implement each class
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private static Banner sign;
    private static String message;

    /* Constructor
     * Initializes scarecrow
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot lf, Boot rf, Banner s, String m) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lf;
        rightFoot = rf;
        sign = s;
        message = m;
    }

    /* Displays the Scarecrow 

    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        Pumpkin myPumpkin = new Pumpkin();
        Shirt myShirt = new Shirt();
        Pants myPants = new Pants();
        Boot leftBoot = new Boot("left");
        Boot rightBoot = new Boot("right");
        Banner myBanner = new Banner(message);
        String myString = new String();

        Scarecrow myScarecrow = new Scarecrow(myPumpkin, myShirt, myPants, leftBoot, rightBoot, myBanner, myString);

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        //if (args.length > 0) {
        //    myScarecrow.message = args[0];
    
            myScarecrow.display();
    }

}