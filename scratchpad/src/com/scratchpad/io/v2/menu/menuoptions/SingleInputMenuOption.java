package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public abstract class SingleInputMenuOption extends MenuOption {
    private Scanner scanner;

    public SingleInputMenuOption(Scanner scanner) {
        this.scanner = scanner;
    }

    public abstract String calculate(int input);

    @Override
    public boolean execute() {
        int input = promptUserForInt("\nPlease enter a number:");
        String result = calculate(input);
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
