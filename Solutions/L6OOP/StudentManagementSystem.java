
/*
   Design a simple student management system with a class representing a student. 
   Include attributes such as name, age, and grade. 
   Implement methods for setting and getting these attributes. 
   Create another class that inherits from the student class to represent a specific type of student (e.g., undergraduate or graduate).
 */




public class StudentManagementSystem {
    public static void main(String[] args) {

        // Create instances of Student and UndergraduateStudent
        Student student1 = new Student("Alice", 20, 85.5);
        UndergraduateStudent undergradStudent1 = new UndergraduateStudent("Bob", 22, 75.0, "Computer Science");

        // Display information
        System.out.println("Student Information:");
        student1.displayInfo();

        System.out.println("\nUndergraduate Student Information:");
        undergradStudent1.displayInfo();
    }
}


