public class Ride implements RideInterface{
    //  Class that tracks the rides available at the theme park, e.g., roller coaster, water riders, etc.

    private int ID;
    private String name;
    private Employee rideOperator;

    /** Default Constructor */   
    public Ride() {
        this.ID = 0;
        this.name = "Unknown";
        this.rideOperator = new Employee(); // calls default constructor of Employee class
    }    

    /** Parameterised (Second) Constructor */    
    public Ride(int ID, String name, Employee rideOperator) {
        // initialise person properties
        setID(ID);
        setName(name);
        setRideOperator(rideOperator);
    }

    /** Getter and Setter Methods with validation */
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


    /** An interface method that adds a visitor to the queue */
    @Override
    public void addVisitorToQueue(Visitor visitor) {

    }

    /** An interface method that removes a visitor from the queue */
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {

    }

    /** An interface method that prints the list of waiting visitors in the queue */
    @Override
    public void printQueue() {

    }

    /** An interface method that runs the ride for one cycle */
    @Override
    public void runOneCycle() {

    }

    /** An interface method that adds a visitor to the ride history */
    @Override
    public void addVisitorToHistory(Visitor visitor) {

    }

    /** An interface method that checks whether the visitor is in the ride history */
    @Override
    public void checkVisitorFromHistory(Visitor visitor) {

    }

    /** An interface method that returns the number of Visitors in the ride history */
    @Override
    public void numberOfVisitors() {

    }

    /** An interface method that prints the list of visitors who took the rides */
    @Override
    public void printRideHistory() {

    }


}
