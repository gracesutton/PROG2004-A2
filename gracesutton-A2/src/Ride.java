import java.util.Queue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ride implements RideInterface{
    //  Class that tracks the rides available at the theme park, e.g., roller coaster, water riders, etc.

    private int ID;
    private String name;
    private Employee rideOperator;
    private Queue<Visitor> queue; 
    private LinkedList<Visitor> rideHistory; // creates a doubly linked list that will store a collection of Visitor objects
    private int maxRider; // how many visitors a ride can take in one cycle
    private int numOfCycles; // how many times the ride is run. By default, it is 0

    /** Default Constructor */   
    public Ride() {
        this.ID = 0;
        this.name = "Unknown";
        this.rideOperator = new Employee(); // calls default constructor of Employee class
        queue = new LinkedList<>();
        rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }    

    /** Parameterised (Second) Constructor */    
    public Ride(int ID, String name, Employee rideOperator, int maxRider) {
        // initialise person properties
        setID(ID);
        setName(name);
        setRideOperator(rideOperator);
        queue = new LinkedList<>();
        rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        numOfCycles = 0; // default value of 0, increase by 1 each time the ride is run.
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        //perform input validation for the max riders - must be a positive value greater than or equal to 1.
        if (maxRider >= 1) {
            this.maxRider = maxRider;
        } else {
            System.out.println("Invalid Max Riders: Must be 1 or more.");
        }
        
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    @Override
    public String toString() {
        return "Ride ID: " + ID + ", Ride name: " + name + ", Ride operator: " + rideOperator.getName() + ", Max riders: " + maxRider + ", Number of cycles: " + numOfCycles;
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

    /** An interface method that removes a visitor from the queue and returns the removed visitor object */
    @Override
    public Visitor removeVisitorFromQueue() {
        Visitor removedVisitor = queue.poll(); // Removes and returns the head of the queue, returns null if queue empty.
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " has been removed from the queue.");
            
        } else {
            System.out.println("No visitors to remove. The queue is empty.");
        }
        return removedVisitor; // returns removed visitor object
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
        if ((rideOperator == null) || (rideOperator.getName().equals("Unknown"))) { // checks if there is a ride operator assigned
            System.out.println("Sorry, no operator is available. The ride cannot be run.");
            return;
        }
        if  (queue.isEmpty()) { // checks if there are visitors in the queue
            System.out.println("There are no waiting visitors. The ride cannot be run.");
            return;
        }

        System.out.println("Running one cycle of the ride...");

        for (int i = 0; i < maxRider; i++) {
            Visitor visitor = removeVisitorFromQueue(); // removes the visitor from the queue and returns the removed visitor object.
            addVisitorToHistory(visitor); // adds visitor to the ride history
        }
        numOfCycles++; // Increment the number of cycles the ride has run
        System.out.println("Ride cycle complete. Total cycles run: " + numOfCycles);
    }

    /** An interface method that adds a visitor to the ride history */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " has been added to the ride history.");
        } else {
            System.out.println("Cannot add a null visitor to the ride history.");
        }
    }

    /** An interface method that checks whether the visitor is in the ride history */
    @Override
    public void checkVisitorFromHistory(Visitor visitor) {
        System.out.println("Checking for visitor.");
        if (visitor == null) {
            System.out.println("Visitor cannot be null.");
            return; // Exit early if the visitor is null
        }

        if (rideHistory.isEmpty()) {
            System.out.println("There is no history for this ride.");
            return; // Exit early if the ride history is empty
        }

        if (rideHistory.contains(visitor)) {
            System.out.println(visitor.getName() + " was found in the ride history.");
        } else {
            System.out.println(visitor.getName() + " was not found in the ride history.");
        }
    }

    /** An interface method that returns the number of Visitors in the ride history */
    @Override
    public void numberOfVisitors() {
        if (!rideHistory.isEmpty()) {
            System.out.println("Number of visitors in the ride history: " + rideHistory.size());
        } else {
            System.out.println("There is no history for this ride. Could not print number of visitors.");
        }
    }

    /** An interface method that prints the list of visitors who took the rides */
    @Override
    public void printRideHistory() {
        if (!rideHistory.isEmpty()) {
            Iterator<Visitor> llIter = rideHistory.iterator(); // sets up an Iterator to loop through the rideHistory LinkedList.
            System.out.println("Ride Visitor History:");
            llIter.forEachRemaining(visitor -> System.out.println(visitor));
        } else {
            System.out.println("There is no history for this ride. Could not print visitors.");
        }
    }

    /** Class method to sort visitors in the ride history by name and age using the Comparator interface */
    public void sortRideHistory() {
        if (!rideHistory.isEmpty()) {
            System.out.println("Sorting visitor history by name and age.");
            Collections.sort(rideHistory, new VisitorComparator());
        } else {
            System.out.println("There is no history for this ride. Could not sort visitors.");
        }
    }

    /** Class method that writes the details of all of the Visitors that have taken the ride to a file. */
    public void exportRideHistory(String fileName) {

        if (rideHistory.isEmpty()) { // check if rideHistory is empty before exporting
            System.out.println("The ride history is empty. No data to export.");
            return; 
    }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {  // try-with-resources 
            for (Visitor visitor : rideHistory) {
                bufferedWriter.write(visitor.toString());
                bufferedWriter.newLine();
            }
            System.out.println("Ride history exported successfully to file.");

        } catch (IOException e) { // exception handling: IOException covers everything.
            e.printStackTrace();
        }
    }

}
