package com.scratchpad.util;

import java.util.Random;

/**
 * Created by larissa on 26/01/2016.
 */
public class Generator {
    private static Random random = new Random();

    public static int generateRandomNumber(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static String generateRandomName(int minLength, int maxLength) {
        int randomLength = generateRandomNumber(minLength, maxLength);
        String name = "";
        for (int i = 0; i < randomLength; i++) {
            if (i == 0) {
                name += (char) generateRandomNumber('A','Z');
            }
            else {
                name += (char) generateRandomNumber('a', 'z');
            }
        }
        return name;
    }

    public static int[] generateFibonacciSequence(int length) {
        int[] fibonacciSequence = new int[length];
        // list? loop it!
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                fibonacciSequence[i] = 1;
            }
            else if (i == 1) {
                fibonacciSequence[i] = 2;
            }
            else {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            }
        }
        return fibonacciSequence;
    }
}
