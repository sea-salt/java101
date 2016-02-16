package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public class MultiplicationMenuOption extends TwoNumberMathMenuOption {

    public MultiplicationMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Multiplication";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
