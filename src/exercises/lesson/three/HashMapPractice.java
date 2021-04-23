package exercises.lesson.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> gradeBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        int id;

        System.out.println("Enter the Student name (or Enter to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                id = input.nextInt();

                gradeBook.put(id, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> booksSilly: gradeBook.entrySet()) {
            System.out.println(booksSilly.getValue() + " (" + booksSilly.getKey() + ")" );
        }
    }
}
