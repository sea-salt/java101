package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public class AdditionMenuOption extends TwoNumberMathMenuOption {

    public AdditionMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Addition";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
