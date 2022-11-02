/*
* Fields and Methods for Vehicle.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-11-02
*/

/**
 * Vehicle Class.
 */
public class Vehicle {

    /**
     * Declare vehicle speed.
     */
    private int speed;

    /**
     * Declare the license plate number.
     */
    private String licensePlate;

    /**
     * Declare vehicle colour.
     */
    private String colour;

    /**
     * Declare the amount of doors.
     */
    private int doorCount;

    /**
     * Declare the max vehicle speed.
     */
    private int maxSpeed;

    /**
     * Vehicle Constructor - allows main to implement values for variables.
     *
     * @param licensePlate - license plate number
     * @param colour - colour of the car
     * @param doorCount - number of doors
     * @param maxSpeed - maximum speed achievable
     */
    public Vehicle(
        String licensePlate,
        String colour,
        int doorCount,
        int maxSpeed) {
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.doorCount = doorCount;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Status() method - prints all current values.
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + this.speed);
        System.out.println("    -> Max Speed: " + this.maxSpeed);
        System.out.println("    -> Number of Doors: " + this.doorCount);
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("    -> Colour: " + this.colour);
        System.out.println("");
    }

    /**
     * GetLicensePlate() method - returns the current licensePlate value.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * SetLicensePlate() method - changes the license plate value.
     *
     * @param licensePlateInput - input from Main to replace licensePlate
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetColour() method - returns the current colour value.
     *
     * @return colour
     */
    public String getColour() {
        return this.colour;
    }

    /**
     * SetColour() method - changes the colour value.
     *
     * @param colourInput - input from Main to replace colour
     */
    public void setColour(String colourInput) {
        this.colour = colourInput;
    }

    /**
     * GetDoorCount() method - returns the current doorCount value.
     *
     * @return doorCount
     */
    public int getDoorCount() {
        return this.doorCount;
    }

    /**
     * GetMaxSpeed() method - returns the current maxSpeed value.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * GetSpeed() method - returns the current speed value.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The accelerate() function.
     *
     * @param accelPower - the power
     * @param accelTime - the period of time
     */
    public void accelerate(int accelPower, int accelTime) {
        this.speed = accelPower * accelTime + this.speed;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * The break() function.
     *
     * @param breakPower - the power
     * @param breakTime - the period of time
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed = this.speed - breakPower * breakTime;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
