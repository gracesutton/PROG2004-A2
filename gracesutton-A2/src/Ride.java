public class Ride {
    //  Class that tracks the rides available at the theme park, e.g., roller coaster, water riders, etc.

    private int ID;
    private String name;
    private Employee rideOperator;

    /**
     * Default Constructor
     */   
    public Ride() {
        this.ID = 0;
        this.name = "Unknown";
        this.rideOperator = new Employee(); // calls default constructor of Employee class
    }    

    /**
     * Parameterised (Second) Constructor
     */    
    public Ride(int ID, String name, Employee rideOperator) {
        // initialise person properties
        setID(ID);
        setName(name);
        setRideOperator(rideOperator);
    }

    /**
     * Getter and Setter Methods with validation
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        //perform input validation for the person ID - must be 4 or more digits, greater than 1000.
        if (ID >= 1000) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID: Must be 4 or more digits.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //perform input validation for the ride name - must be btwn 3-30 characters.
        if ((name.length() > 3) && (name.length() < 30)) {
            this.name = name;
        } else {
            System.out.println("Invalid Name: Must be between 3 and 30 characters.");
        }
    }


    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

}
