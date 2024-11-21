import java.util.ArrayList;

public class Employee extends Person {
    // Class that tracks the theme park staff who operate rides

    private String employmentType;
    private String role;

    // private String[] validEmploymentTypes = {"Casual", "Full-time", "Part-time"};

    // private String[] validRoles = {"Ride Operator", "Hospitality", "Retail"};

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

    }

    /**
     * getter and setter methods
     */    
    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {

        ArrayList<String> validEmploymentTypes = new ArrayList<>();

        validEmploymentTypes.add("Casual");
        validEmploymentTypes.add("Full-time");
        validEmploymentTypes.add("Part-time");

        if (validEmploymentTypes.contains(employmentType)) {
            this.employmentType = employmentType;
        } else {
            System.out.println("Employment type is not valid.");
        }

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
