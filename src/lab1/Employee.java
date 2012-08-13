package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    String firstName;
    String lastName;
    public String ssn;
    public Date birthDate;
    boolean metWithHr;
    boolean metDeptStaff;
    boolean reviewedDeptPolicies;
    boolean movedIn;
    String cubeId;

    public Employee() {

    }
    
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    public Employee(String firstName, String lastName, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    public Employee(String firstName, String lastName, String ssn, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthDate = birthDate;
    }

    public void newEmployeeOrientation() {
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
        
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }
}
