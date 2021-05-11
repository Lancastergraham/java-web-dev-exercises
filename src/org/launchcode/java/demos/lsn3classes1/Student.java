package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

/*    public Student(String name, int studentId) {
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;
//    }
 */

    public Student(String name, int studentID) {
        this(name, studentID, 0, 0);
    }

    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits += numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel() {
        String resultLevel = "";
        if (this.getNumberOfCredits() <= 29) {
            resultLevel = "Freshman";
        } else if (this.getNumberOfCredits() <= 59) {
            resultLevel = "Sophomore";
        } else if (this.getNumberOfCredits() <= 89) {
            resultLevel = "Junior";
        } else if (this.getNumberOfCredits() >= 90) {
            resultLevel = "Senior";
        }

        return resultLevel;
    }

    public void addGrade(int credits, double numericalGrade) {
        //GPA = total quality score / total number of credits
        /*
        example:
        Class A with 4.0 worth 3 credit hours and Class B with 3.0 worth 4 credit hours
        total quality score = 4.0 * 3 + 3.0 * 4 = 24
        GPA = 24 (total quality score) / 7 (3 + 4 the Credits associated with the courses) = 3.43
         */
        int currentCredits = this.getNumberOfCredits();
        double currentGPA = this.getGpa();

        if ( currentCredits == 0 && currentGPA == 0) {
            this.setNumberOfCredits(credits);
            this.setGpa(numericalGrade);

            return;
        }

        double currentTotalQuality = gpa * numberOfCredits;
        currentTotalQuality += credits * numericalGrade;
        this.setNumberOfCredits(credits);
        this.gpa = currentTotalQuality / numberOfCredits;

    }

    @Override
    public String toString(){
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", name, getGradeLevel(),
                getNumberOfCredits(), getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if(toBeCompared == this) {
            return true;
        }
        if(toBeCompared == null) {
            return false;
        }
        if(toBeCompared.getClass() != getClass()) {
            return false;
        }
        //Cast check, this is of type student.
        Student theStudent = (Student) toBeCompared;

        return theStudent.getStudentId() == this.getStudentId();
    }

}