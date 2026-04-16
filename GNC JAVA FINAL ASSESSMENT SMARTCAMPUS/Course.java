//This class stores course details
class Course{
    int courseid;
    String coursename;
    double fee;
    //Constructor to initialize course details
    Course(int courseid,String coursename,double fee){
        this.courseid = courseid;
        this.coursename = coursename;
        this.fee = fee;
    }
    //Method to display course details
    void displayDetails(){
        System.out.println("Course ID:" + courseid);
        System.out.println("Course Name:" + coursename);
    }

    public static void main (String[] args){
        Course course = new Course(1,"Computer science",500.0);
        course.displayDetails ();
    }
}