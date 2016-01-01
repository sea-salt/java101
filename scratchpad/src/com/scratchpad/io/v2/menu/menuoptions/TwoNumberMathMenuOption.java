package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public abstract class TwoNumberMathMenuOption extends MenuOption {
    private Scanner scanner;

    public TwoNumberMathMenuOption(Scanner scanner) {
        this.scanner = scanner;
    }

    public abstract int calculate(int firstNumber, int secondNumber);

    @Override
    public boolean execute() {
        int firstNumber = promptUserForInt("\nPlease enter the first number:");
        int secondNumber = promptUserForInt("\nPlease enter the second number:");
        int result = calculate(firstNumber, secondNumber);
        print("\nThe result is:\n" + result);
        return false;
    }

    private int promptUserForInt(String promptMessage) {
        print(promptMessage);
        int userInput;
        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
        }
        else {
            print("Invalid input: defaulting to 0.");
            userInput = 0;
        }
        // Exhaust the input so that the next call to nextInt doesn't fail due to a hidden \n character.
        scanner.nextLine();
        return userInput;
    }

}
