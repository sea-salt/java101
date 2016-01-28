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
}
