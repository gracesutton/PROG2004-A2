public class Employee extends Person {
    // Class that tracks the theme park staff who operate rides

    private String employmentType;
    private String role;

    /**
     * Default Constructor for Employee
     */
    public Employee() {
        super(); // Call default constructor of Person
        this.employmentType = "Unknown";
        this.role = "Unknown";
    }

    /**
     * Constructor for objects of Employee
     */
    public Employee(int ID, String name, int age, String employmentType, String role) {
        super(ID, name, age); // Call parameterised constructor of HealthProfessional
        setEmploymentType(employmentType);
        setRole(role);
    }

    /**
     * getter and setter methods
     */    
    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        // input validation for employmentType. Must be one of: Casual, Full-time, Part-time.
        switch (employmentType) {
            case "Casual", "Full-time", "Part-time" -> this.employmentType = employmentType;
            default -> System.out.println(employmentType + " is invalid. Must be one of: Casual, Full-time, Part-time.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        // input validation for employee role. Must be one of: Ride Operator, Hospitality, Retail.
        switch (role) {
            case "Ride Operator", "Hospitality", "Retail" -> this.role = role;
            default -> System.out.println(role + " is invalid. Must be one of: Ride Operator, Hospitality, Retail.");
        }
    }

    /** Method to export the employee details as a string */
    @Override
    public String toString() {
        return super.toString() + " Employment type: " + employmentType + " Role: " + role;
    }

}
