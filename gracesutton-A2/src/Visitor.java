import java.time.LocalDate;

public class Visitor extends Person{
    // Class that tracks the theme park visitors

    private LocalDate visitDate;
    private String ticketType;

    /**
     * Default Constructor for Visitor
     */
    public Visitor() {
        super(); // Call default constructor of Person
        this.visitDate = LocalDate.now(); // default date of today
        this.ticketType = "Unknown";
    }

    /**
     * Constructor for objects of Vistor
     */
    public Visitor(int ID, String name, int age, LocalDate visitDate, String ticketType) {
        super(ID, name, age); // Call parameterised constructor of HealthProfessional
        setVisitDate(visitDate);
        setTicketType(ticketType);
    }

    /**
     * getter and setter methods
     */    
    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        //perform input validation for visitDate - can't be on Christams Day.
        if ((visitDate.getMonthValue() == 12) && (visitDate.getDayOfMonth() == 25)) {
            System.out.println("Sorry, the theme park is closed on Christmas Day.");
        } else {
            this.visitDate = visitDate;
        }

    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
        // input validation for ticket type. Must be one of: Child, Adult, Student, or Concession
        switch (ticketType) {
            case "Child", "Adult", "Student", "Concession" -> this.ticketType = ticketType;
            default -> System.out.println(ticketType + " is invalid. Must be one of: Child, Adult, Student, Concession.");
        }
    }

    /** Method to export the visitor details as a string */
    @Override
    public String toString() {
        return super.toString() + " Visit date: " + visitDate + " Ticket type: " + ticketType;
    }

}
