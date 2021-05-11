package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student billy = new Student("Lancaster");
        Student gilly = new Student("Lor");
        Student milly = new Student("Thor");
        Teacher skill = new Teacher("Jayne", "Smith", "Java", 2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(billy);
        students.add(milly);
        students.add(gilly);

        System.out.println(billy.getStudentId());
        System.out.println(gilly.getStudentId());
        System.out.println(billy.getStudentId());
        System.out.println(milly.getStudentId());

        milly.addGrade(4, 4.0);
        System.out.println(milly.getGpa());
        milly.addGrade(4, 4.0);

        System.out.println(milly.getNumberOfCredits());
        System.out.println(milly.getGpa());

        milly.addGrade(3, 3.5);

        System.out.println(milly.getNumberOfCredits());
        System.out.println(milly.getGpa());

        System.out.println(milly.toString());
        System.out.println(milly);


        Course mills = new Course(students, skill);

        System.out.println(mills.getNumberOfStudents());
    }
}
