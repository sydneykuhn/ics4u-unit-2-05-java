/*
* Main class for vehicle.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-11-02
*/

/**
 * Main class.
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final int two = 2;
        final int four = 4;
        final int five = 5;
        final int ten = 10;
        final int hundred = 100;

        // Create Ford Focus
        System.out.println("Created Ford Focus");
        final Vehicle fordFocus = new Vehicle("B40-C4RR0", "white", 4, 284);

        System.out.println("Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(ten, ten);
        System.out.println("New speed:" + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColour("black");
        System.out.println("New colour:" + fordFocus.getColour());

        // Create Ferrari
        System.out.println("");
        System.out.println("Created Ferrari");
        final Vehicle ferrari = new Vehicle("VHD-35HU", "red", 2, 320);

        System.out.println("Status: ");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(hundred, four);
        System.out.println("New speed: " + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breaking(ten, ten);
        System.out.println("New speed:  " + ferrari.getSpeed());

        System.out.println("Changing colour to racing red:");
        ferrari.setColour("racing red!");
        System.out.println("New colour: " + ferrari.getColour());

        // Create Citroen Ami
        System.out.println("");
        System.out.println("Created Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("FS-695-DQ", "blue", 2, 45);

        System.out.println(" Status:");
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(five, ten);
        System.out.println(" New speed:" + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breaking(two, ten);
        System.out.println("  New speed:" + citroenAmi.getSpeed());

        System.out.println("Changing colour to purple:");
        citroenAmi.setColour("purple");
        System.out.println(" New colour:" + citroenAmi.getColour());

        System.out.println("\nDone.");
    }
}
