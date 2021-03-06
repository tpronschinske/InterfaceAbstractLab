package lab2;


/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
    
    public final String getCourseName() {
        return courseName;
    }   
    @Override
    public final String getPrerequisites(){
        return "None";
    }
    @Override
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            System.out.println("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }
    @Override   
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            System.out.println("Error: prerequisites cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {  
            System.out.println("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            System.out.println("Error: prerequisites cannot be null of empty string");
        }
        this.courseName = courseName;
    }



    
}
