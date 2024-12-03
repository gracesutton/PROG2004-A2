import java.time.LocalDate;

public class AssignmentTwo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-------------------");
        partThree();
        System.out.println("-------------------");
        partFourA();
        System.out.println("-------------------");
        partFourB();
        System.out.println("-------------------");
        partFive();
        System.out.println("-------------------");
        partSix();
        System.out.println("-------------------");
        partSeven();
        System.out.println("-------------------");

    }

    public static void partThree(){

        // Create a new Employee object and call its ToString() method
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        System.out.println(e1);

        // Create a new Ride object and call its ToString() method
        Ride r1 = new Ride(1001, "Superman Escape", e1);
        System.out.println(r1);

        // Create 5 new Visitor objects
        Visitor v1 = new Visitor(1001, "Grace", 24, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1004, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1005, "Elizabeth", 43, LocalDate.now(), "Adult");

        System.out.println(v1); // call ToString() method

        // Add visitors to the queue
        r1.addVisitorToQueue(v1);
        r1.addVisitorToQueue(v2);
        r1.addVisitorToQueue(v3);
        r1.addVisitorToQueue(v4);
        r1.addVisitorToQueue(v5);

        // Remove a Visitor from the Queue
        r1.removeVisitorFromQueue();

        // Print all Visitors in the Queue
        r1.printQueue();

    }

    public static void partFourA(){

        // Create new Employee and Ride objects
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1);

        // Create 5 new Visitor objects
        Visitor v1 = new Visitor(1001, "Grace", 24, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1004, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1005, "Elizabeth", 43, LocalDate.now(), "Adult");

        // Add 5 Visitors to the RideHistory collection
        r1.addVisitorToHistory(v1);
        r1.addVisitorToHistory(v2);
        r1.addVisitorToHistory(v3);
        r1.addVisitorToHistory(v4);
        r1.addVisitorToHistory(v5);

        // Check if a Visitor is in the collection
        r1.checkVisitorFromHistory(v3);

        // Print the number of Visitors in the collection
        r1.numberOfVisitors();

        // Print all Visitors in the collection
        r1.printRideHistory();

    }

    public static void partFourB(){

        // Create new Employee and Ride objects
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1);

        // Create 5 new Visitor objects
        Visitor v1 = new Visitor(1001, "Grace", 24, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1004, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1005, "Elizabeth", 43, LocalDate.now(), "Adult");

        // Add 5 Visitors to the Ride History
        r1.addVisitorToHistory(v1);
        r1.addVisitorToHistory(v2);
        r1.addVisitorToHistory(v3);
        r1.addVisitorToHistory(v4);
        r1.addVisitorToHistory(v5);

        // Print all Visitors in the ride history, sort the ride history, then print the new sorted ride history.
        r1.printRideHistory();       
        r1.sortRideHistory(); // sorts by name and age
        r1.printRideHistory(); 

    }

    public static void partFive(){

        // Create new Employee and Ride objects
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1, 4); // calls overloaded contructor with maxRider

        // Create 10 new Visitor objects
        Visitor v1 = new Visitor(1001, "Grace", 24, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1004, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1005, "Elizabeth", 43, LocalDate.now(), "Adult");
        Visitor v6 = new Visitor(1006, "Lucy", 30, LocalDate.now(), "Adult");
        Visitor v7 = new Visitor(1007, "Jade", 23, LocalDate.now(), "Student");
        Visitor v8 = new Visitor(1008, "Paige", 24, LocalDate.now(), "Adult");
        Visitor v9 = new Visitor(1009, "Holly", 12, LocalDate.now(), "Child");
        Visitor v10 = new Visitor(1010, "Jake", 9, LocalDate.now(), "Child");
        
        // Add 10 Visitors to the Queue
        r1.addVisitorToQueue(v1);
        r1.addVisitorToQueue(v2);
        r1.addVisitorToQueue(v3);
        r1.addVisitorToQueue(v4);
        r1.addVisitorToQueue(v5);
        r1.addVisitorToQueue(v6);
        r1.addVisitorToQueue(v7);
        r1.addVisitorToQueue(v8);
        r1.addVisitorToQueue(v9);
        r1.addVisitorToQueue(v10);

        // Print all Visitors in the queue
        r1.printQueue();

        // Run one cycle
        r1.runOneCycle();

        // Print all Visitors in the queue after one cycle is run
        r1.printQueue();

        // Print all Visitors in the ride history collection after one cycle is run
        r1.printRideHistory();

    }

    public static void partSix(){

        // Create new Employee and Ride objects
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1, 4);

        // Create 5 new Visitor objects
        Visitor v1 = new Visitor(1001, "Grace", 24, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1004, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1005, "Elizabeth", 43, LocalDate.now(), "Adult");

        // Add 5 Visitors to the Ride History
        r1.addVisitorToHistory(v1);
        r1.addVisitorToHistory(v2);
        r1.addVisitorToHistory(v3);
        r1.addVisitorToHistory(v4);
        r1.addVisitorToHistory(v5);

        // Export the Visitors from the Ride History to a file
        r1.exportRideHistory("SupermanEscapeRideHistory.txt");

    }

    public static void partSeven(){

        // Create new Employee and Ride objects
        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1, 4);

        // Restore the Ride History from a file
        r1.importRideHistory("SupermanEscapeRideHistory.txt");

        // Print the number of Visitors in the Ride History to confirm that the correct number of Visitors was imported
        r1.numberOfVisitors();

        // Print all Visitors in the Ride History to confirm that the details of each Visitor were imported correctly
        r1.printRideHistory();

    }

}
