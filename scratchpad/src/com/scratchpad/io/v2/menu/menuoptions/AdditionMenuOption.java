package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public class AdditionMenuOption extends TwoNumberMathMenuOption {

    public AdditionMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getShortcut() {
        return "1";
    }

    @Override
    public String getLabel() {
        return "Addition";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
