// Subclass representing a specific type of student
class UndergraduateStudent extends Student {
    private String major;

    // Constructor
    public UndergraduateStudent(String name, int age, double grade, String major) {
        super(name, age, grade);
        this.major = major;
    }

    // Getter and Setter method for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Display information method (overrides superclass method)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass
        System.out.println("Major: " + major);
    }
}