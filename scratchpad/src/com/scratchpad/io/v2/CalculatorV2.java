package com.scratchpad.io.v2;

import com.scratchpad.io.v2.menu.Menu;
import com.scratchpad.io.v2.menu.menuoptions.ExitMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.MenuOption;
import com.scratchpad.io.v2.menu.menuoptions.PrintWeekMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.SwitchStatementMenuOption;

import java.util.Scanner;

public class CalculatorV2 {

    public static void main(String[] args) {
        CalculatorV2 calculator = new CalculatorV2();
        calculator.start();
    }

    private Scanner scanner;
    private Menu menu;

    public CalculatorV2() {
        scanner = new Scanner(System.in);

        menu = new Menu();
//        menu.addMenuOption(new AdditionMenuOption(scanner));
//        menu.addMenuOption(new SubtractionMenuOption(scanner));
//        menu.addMenuOption(new MultiplicationMenuOption(scanner));
//        menu.addMenuOption(new RandomNumberMenuOption(scanner));
//        menu.addMenuOption(new RandomNameMenuOption());
//        menu.addMenuOption(new FibonacciSequenceMenuOption(scanner));
//        menu.addMenuOption(new GridMenuOption(scanner));
//        menu.addMenuOption(new NumberGridMenuOption());
//        menu.addMenuOption(new NumberGridMenuOption2());
        menu.addMenuOption(new PrintWeekMenuOption());
        menu.addMenuOption(new SwitchStatementMenuOption());
        menu.addMenuOption(new ExitMenuOption());
    }

    private void start() {
        print("--------------------------------\n" +
                "Welcome to ZeUltra Calculator!\n" +
                "--------------------------------");

        while (true) {
            print(menu);
            String userInput = scanner.nextLine();
            MenuOption menuOption = menu.getMenuOption(userInput);
            if (menuOption != null) {
                boolean shouldExit = menuOption.execute();
                if (shouldExit) {
                    break;
                }
            }
            else {
                print("\n" + userInput + " is invalid input! Please enter a number.");
            }
        }
    }

    private void print(Object object) {
        System.out.println(object);
    }
}
