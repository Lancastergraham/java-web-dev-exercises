package exercises;

import java.util.Scanner;

public class EighthWonder {
    public static void main(String[] args) {
        String aliceWords = "Alice was beginning to " +
                "get very tired of sitting by her " +
                "sister on the bank, and of having nothing" +
                " to do: once or twice she had peeped into the" +
                " book her sister was reading, but it " +
                "had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What word should we look for?");
        String searchTerm = input.next();

        if(aliceWords.toLowerCase().contains(searchTerm.toUpperCase()
                .toLowerCase())){
            int index = aliceWords.toLowerCase()
                    .indexOf(searchTerm.toLowerCase());
            aliceWords = aliceWords.toLowerCase()
                    .replaceFirst(searchTerm.toLowerCase(),"");

            System.out.println("The index of the " + searchTerm + " is " + index
                    + ", and the length of the word is " + searchTerm.length());
        }

        System.out.println(aliceWords);

    }
}
