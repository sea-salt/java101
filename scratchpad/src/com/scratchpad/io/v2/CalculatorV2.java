package com.scratchpad.io.v2;

import com.scratchpad.io.v2.menu.Menu;
import com.scratchpad.io.v2.menu.menuoptions.AdditionMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.ExitMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.MenuOption;
import com.scratchpad.io.v2.menu.menuoptions.MultiplicationMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.RandomNumberMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.SubtractionMenuOption;

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

        MenuOption add = new AdditionMenuOption(scanner);
        MenuOption subtract = new SubtractionMenuOption(scanner);
        MenuOption multiply = new MultiplicationMenuOption(scanner);
        MenuOption randomize = new RandomNumberMenuOption(scanner);
        MenuOption exit = new ExitMenuOption();

        menu = new Menu();
        menu.addMenuOption(add);
        menu.addMenuOption(subtract);
        menu.addMenuOption(multiply);
        menu.addMenuOption(randomize);
        menu.addMenuOption(exit);
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
