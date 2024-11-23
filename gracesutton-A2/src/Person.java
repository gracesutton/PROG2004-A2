public abstract class Person {
    // Base class to represent a Person

    private int ID;
    private String name;
    private int age;

    /**
     * Default Constructor
     */   
    protected Person() {
        this.ID = 0;
        this.name = "Unknown";
        this.age = 0;
    }    

    /**
     * Parameterised (Second) Constructor
     */    
    protected Person(int ID, String name, int age) {
        // initialise person properties
        setID(ID);
        setName(name);
        setAge(age);
    }

    /**
     * Getter and Setter Methods with validation
     */
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        //perform input validation for the person ID - must be 4 or more digits, greater than 1000.
        if (ID >= 1000) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID: Must be 4 or more digits.");
        }
    }

    public void setName(String name) {
        //perform input validation for the person's name - must be btwn 3-30 characters.
        if ((name.length() > 3) && (name.length() < 30)) {
            this.name = name;
        } else {
            System.out.println("Invalid Name: Must be between 3 and 30 characters.");
        }
    }

    public void setAge(int age) {
        //perform input validation for age - must be between 0 and 130 years old.
        if ((age >= 0) && (age <= 130)) { 
            this.age = age;
        } else {
            System.out.println("Invalid Age: Must be between 0 and 130.");
        }
    }

    // Methods are public abstract

    /** Method to export the person details as a string */
    @Override
    public String toString() {
        return "ID: " + ID + " Name: " + name + " Age: " + age;
    }

}



