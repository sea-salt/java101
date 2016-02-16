package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

public class SubtractionMenuOption extends TwoNumberMathMenuOption {

    public SubtractionMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Subtraction";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}
