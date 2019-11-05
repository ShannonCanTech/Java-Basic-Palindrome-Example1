package shannonfoster.dev;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
	// .contains() method example
        String mom = "admomrt";
        if(mom.contains("mom")){
            System.out.println("True");
        }

//        User inputs word
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String answer = scan.nextLine();

//        Splits string into list of characters
        String[] listAnswer = answer.split("", answer.length());
        
//        Reverses a string and appends it to string
        StringBuilder reverseAnswer = new StringBuilder();

        for(int i = 1; i <= answer.length(); ++i){
            String letter = listAnswer[answer.length()-i];
            reverseAnswer.append(letter);
        }
        
        System.out.println(reverseAnswer);
        
//        Checks if answer matches answer reversed        
        if(answer.toLowerCase().contains(reverseAnswer)){     // use .equalsIgnoreCase instead
            System.out.println("It's a palindrome!");
        } else{
            System.out.println("False, but try again! :D");
        }
    }
}
