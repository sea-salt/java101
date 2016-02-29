package com.scratchpad.io.v2;

import com.scratchpad.io.v2.menu.Menu;
import com.scratchpad.io.v2.menu.menuoptions.AdditionMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.ExitMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.FibonacciSequenceMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.GridMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.MenuOption;
import com.scratchpad.io.v2.menu.menuoptions.MultiplicationMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.NumberGridMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.NumberGridMenuOption2;
import com.scratchpad.io.v2.menu.menuoptions.PrintWeekMenuOption;
import com.scratchpad.io.v2.menu.menuoptions.RandomNameMenuOption;
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
        MenuOption randomizeName = new RandomNameMenuOption();
        MenuOption fibonacci = new FibonacciSequenceMenuOption(scanner);
        MenuOption grid = new GridMenuOption(scanner);
        MenuOption numberGrid = new NumberGridMenuOption();
        MenuOption numberGrid2 = new NumberGridMenuOption2();
        MenuOption printDaysOfWeek = new PrintWeekMenuOption();
        MenuOption exit = new ExitMenuOption();

        menu = new Menu();
//        menu.addMenuOption(add);
//        menu.addMenuOption(subtract);
//        menu.addMenuOption(multiply);
//        menu.addMenuOption(randomize);
//        menu.addMenuOption(randomizeName);
//        menu.addMenuOption(fibonacci);
//        menu.addMenuOption(grid);
//        menu.addMenuOption(numberGrid);
//        menu.addMenuOption(numberGrid2);
        menu.addMenuOption(printDaysOfWeek);
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
