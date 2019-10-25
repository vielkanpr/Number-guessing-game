package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Number Guessing game. To play guess any number betweeen 0 and 75");
        int guess;
        int answer;
        answer = 21;
        do {
            Scanner keyboard;
            keyboard = new Scanner(System.in);
            System.out.println(" please guess a number now;");
            guess = keyboard.nextInt();
            if (guess > answer ){
                System.out.println("That number is too high. You can try again by inserting another number.");
            }
            else if (guess< answer){
                System.out.println("That number is too low. You can try again by inserting another number.");
            }
            else if (guess == answer){
                System.out.println("Congratulations! You guessed exactly the right number!");
            }
    }
    while (guess > answer || guess < answer);
        System.out.println("Thank you for playing the game.");
  }
}
