package com.scratchpad.io.v2.menu.menuoptions;

import com.scratchpad.util.Generator;

import java.util.Scanner;

/**
 * Created by larissa on 12/01/2016.
 */
public class RandomNumberMenuOption extends TwoNumberMathMenuOption {

    public RandomNumberMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Generate Random Number";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return Generator.generateRandomNumber(firstNumber, secondNumber);
    }
}
