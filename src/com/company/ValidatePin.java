package com.company;

import java.util.Scanner;
public class ValidatePin {
    public static void main(String[] args) {
        int validPIN = 1234;          // Declare a valid integer PIN
        int enteredPIN = 0;           // PIN that the user is to enter


        // PIN Validation Loop                                 //While the entered PIN (=0) DNE the valid PIN
        while (enteredPIN != validPIN) {                       //Compare the user-entered PIN with already declared PIN
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your 4-digit PIN: ");    // Prompt user to enter PIN
            enteredPIN = sc.nextInt();

            //If the entered PIN is not the same, prompt the user to enter the PIN again
            if (enteredPIN != validPIN)
                System.out.println("Invalid PIN. Please Try Again: ");
        }
        // Print a message confirming that the correct PIN has been entered and that the user now has
        System.out.println("PIN accepted. Access granted.");
    }
    // Loop repeats until the correct PIN is entered

}