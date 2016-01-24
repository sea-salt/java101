package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by larissa on 12/01/2016.
 */
public class RandomNumberMenuOption extends TwoNumberMathMenuOption {
    private Random random;


    public RandomNumberMenuOption(Scanner scanner) {
        super(scanner);

        random = new Random();
    }

    @Override
    public String getShortcut() {
        return "4";
    }

    @Override
    public String getLabel() {
        return "Generate Random Number";
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        int min = firstNumber;
        int max = secondNumber;
        int randomNumber = min + random.nextInt(max - min + 1);
        return randomNumber;
    }

}
