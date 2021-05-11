package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private ArrayList<Student> students = new ArrayList<>();
    private int numberOfStudents;
    private Teacher teacher = new Teacher();

    public Course(ArrayList<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
        this.numberOfStudents = students.size();
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }






    public void addStudent() {
        Scanner input = new Scanner(System.in);
        String name = "";
        int id = 0;

        System.out.print("Enter the Student's name: ");
        if(input.hasNextLine()) {
            name = input.nextLine();
        }

        System.out.print("Enter the Student's ID: ");
        if(input.hasNextInt()) {
            id = input.nextInt();
        }

        Student newStudent = new Student(name, id);

        students.add(newStudent);
    }
}
