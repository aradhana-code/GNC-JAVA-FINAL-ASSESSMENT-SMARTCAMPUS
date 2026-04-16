import java.util.*;
//This class handles enrollment of students in courses
public class Enrollment{
    //HashMap to store student enrollments
    HashMap<Integer, ArrayList<Integer>> enrollments = new HashMap<>();
    //Method to store a student in a cource
    void enroll(int studentid,int courseid){
        //If student is not present,creat a new list
        enrollments.putIfAbsent(studentid, new ArrayList<>());
        enrollments.get(studentid).add(courseid);
    }
    //Method to display enrollments
    void displayEnrollments(){
        for(int sid : enrollments.keySet()){
            System.out.println("Student ID:" + sid + " is enrolled in courses:" + enrollments.get(sid));
        }
    }

    public static void main (String[] args){
        Enrollment enrollment = new Enrollment();
        enrollment.enroll(2,1);
        enrollment.enroll(2,3);
        enrollment.displayEnrollments();
    }
}