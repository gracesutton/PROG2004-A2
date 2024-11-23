import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Ride implements RideInterface{
    //  Class that tracks the rides available at the theme park, e.g., roller coaster, water riders, etc.

    private int ID;
    private String name;
    private Employee rideOperator;
    private Queue<Visitor> queue;

    /** Default Constructor */   
    public Ride() {
        this.ID = 0;
        this.name = "Unknown";
        this.rideOperator = new Employee(); // calls default constructor of Employee class
        queue = new LinkedList<>();
    }    

    /** Parameterised (Second) Constructor */    
    public Ride(int ID, String name, Employee rideOperator) {
        // initialise person properties
        setID(ID);
        setName(name);
        setRideOperator(rideOperator);
        queue = new LinkedList<>();
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

    @Override
    public String toString() {
        return "Ride ID: " + ID + " Ride name: " + name + " Ride operator: " + rideOperator.getName();
    }

    /** An interface method that adds a visitor to the queue */
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            queue.offer(visitor);
            System.out.println(visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("Cannot add a null visitor to the queue.");
        }
    }

    /** An interface method that removes a visitor from the queue */
    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = queue.poll(); // Removes and returns the head of the queue, returns null if queue empty.
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("No visitors to remove. The queue is empty.");
        }
    }

    /** An interface method that prints the list of waiting visitors in the queue */
    @Override
    public void printQueue() {
        if (!queue.isEmpty()) {
            Iterator<Visitor> qIter = queue.iterator(); // sets up an Iterator to loop through the queue.
            System.out.println("Visitors in Queue:");
            qIter.forEachRemaining(visitor -> System.out.println(visitor));
        } else {
            System.out.println("The queue is empty. No visitors to print.");
        }
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
