package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Number Guessing game. To play guess any number betweeen 1 and 50");
        int guess;
        int answer;
        answer = 21;
        do {
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            System.out.println(" please guess number now;");
            guess = keyboard.nextInt();
            if (guess > answer ){
                System.out.println("that number is too high. Please try again.");
            }
            else if (guess< answer){
                System.out.println("that number is too low. Try again please.");
            }
            else if (guess == answer){
                System.out.println("Congratulations! You guessed the right number!");
            }
    }
  }
}
