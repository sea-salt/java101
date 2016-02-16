package com.scratchpad.io.v2.menu.menuoptions;

import com.scratchpad.util.Generator;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by larissa on 31/01/2016.
 */
public class FibonacciSequenceMenuOption extends SingleInputMenuOption {

    public FibonacciSequenceMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Fibonacci Sequence";
    }

    @Override
    public String calculate(int length) {
        int[] fibNumbers = Generator.generateFibonacciSequence(length);
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (int fibNumber : fibNumbers) {
            stringJoiner.add(fibNumber + "");
        }
        return stringJoiner.toString();
    }
}
