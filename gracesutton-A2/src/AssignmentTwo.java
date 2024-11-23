import java.time.LocalDate;

public class AssignmentTwo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-------------------");
        partThree();
        System.out.println("-------------------");
        partFourA();
        System.out.println("-------------------");

    }

    public static void partThree(){

        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        System.out.println(e1);

        Ride r1 = new Ride(1001, "Superman Escape", e1);
        System.out.println(r1);

        Visitor v1 = new Visitor(1001, "Grace", 23, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1002, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1002, "Elizabeth", 43, LocalDate.now(), "Adult");

        System.out.println(v1);

        r1.addVisitorToQueue(v1);
        r1.addVisitorToQueue(v2);
        r1.addVisitorToQueue(v3);
        r1.addVisitorToQueue(v4);
        r1.addVisitorToQueue(v5);

        r1.removeVisitorFromQueue();

        r1.printQueue();

    }

    public static void partFourA(){

        Employee e1 = new Employee(1001, "Luke", 25, "Full-time", "Ride Operator");
        Ride r1 = new Ride(1001, "Superman Escape", e1);

        Visitor v1 = new Visitor(1001, "Grace", 23, LocalDate.now(), "Student");
        Visitor v2 = new Visitor(1002, "Crawford", 21, LocalDate.now(), "Adult");
        Visitor v3 = new Visitor(1003, "Callum", 11, LocalDate.now(), "Child");
        Visitor v4 = new Visitor(1002, "Michael", 45, LocalDate.now(), "Adult");
        Visitor v5 = new Visitor(1002, "Elizabeth", 43, LocalDate.now(), "Adult");

        r1.addVisitorToHistory(v1);
        r1.addVisitorToHistory(v2);
        r1.addVisitorToHistory(v3);
        r1.addVisitorToHistory(v4);
        r1.addVisitorToHistory(v5);

        r1.checkVisitorFromHistory(v3);

        r1.numberOfVisitors();
        r1.printRideHistory();

    }

    public void partFourB(){

    }

    public void partFive(){

    }

    public void partSix(){

    }

    public void partSeven(){

    }

}
