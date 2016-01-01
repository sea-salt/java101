package com.scratchpad.io.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorV1 {

    public static void main(String[] args) {
        CalculatorV1 calculator = new CalculatorV1();
        calculator.start();
    }

    private Scanner scanner;

    public CalculatorV1() {
        scanner = new Scanner(System.in);
    }

    private void start() {
        print("--------------------------------\n" +
                "Welcome to ZeUltra Calculator!\n" +
                "--------------------------------\n");

        while(true) {
            printMenuOptions();
            try {
                int menuOption = scanner.nextInt();
                if (menuOption == 1 || menuOption == 2) {
                    print("Please enter the first number:");
                    int firstNumber = scanner.nextInt();
                    print("Please enter the second number:");
                    int secondNumber = scanner.nextInt();
                    print("The result is:");
                    if (menuOption == 1) {
                        int result = firstNumber + secondNumber;
                        print(result + "");
                    }
                    else {
                        int result = firstNumber - secondNumber;
                        print(result + "");
                    }
                }
                else if (menuOption == 3) {
                    print("Goodbye!");
                    break;
                }
                else {
                    print("Sorry, " + menuOption + " is an invalid option");
                }
            }
            catch (InputMismatchException ime) {
                String input = scanner.nextLine();
                System.err.println(input + " is invalid input! Please enter a number.");
            }
            catch (Exception ex) {
                // We have no idea what went wrong...
                System.err.println("Unknown error: " + ex.getMessage());
            }
        }

        // Alternative way to deal with invalid input and avoid exceptions altogether.
        // if (scanner.hasNextInt()) {
        //     int input = scanner.nextInt();
        // }
        // else {
        //     System.out.println("Invalid input, please try again.");
        // }
    }

    private void printMenuOptions() {
        print("");
        print("Menu Options:\n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Exit\n\n" +
                "Please enter a menu option:");
    }

    private void print(String str) {
        System.out.println(str);
    }

}
