import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Used to take input

        // List to store students and courses
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Enrollment enrollment = new Enrollment(); // Create enrollment object

        // Menu-driven loop
        while (true) {
            System.out.println("\n1. Add Student\n2. Add Course\n3. Enroll Student\n4. View Students\n5. View Enrollments\n6. Exit");

            int choice = sc.nextInt(); // Take user choice

            switch (choice) {

                case 1:
                    // Add student
                    System.out.print("Enter ID Name Email: ");
                    students.add(new Student(sc.nextInt(), sc.next(), sc.next()));
                    break;

                case 2:
                    // Add course
                    System.out.print("Enter Course ID Name Fee: ");
                    courses.add(new Course(sc.nextInt(), sc.next(), sc.nextDouble()));
                    break;

                case 3:
                    // Enroll student in a course
                    System.out.print("Enter StudentID and CourseID: ");
                    enrollment.enroll(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    // Display all students
                    for (Student s : students) {
                        s.displayDetails();
                    }
                    break;

                case 5:
                    // Display all enrollments
                    enrollment.displayEnrollments();
                    break;

                case 6:
                    // Exit program
                    System.exit(0);

                default:
                    // If wrong input
                    System.out.println("Invalid choice");
            }
        }
    }
}