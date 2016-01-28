package com.scratchpad.io.v2.menu.menuoptions;

import com.scratchpad.util.Generator;

/**
 * Created by larissa on 28/01/2016.
 */
public class RandomNameMenuOption extends MenuOption {
    private static final int SHORTEST_NAME = 4;
    private static final int LONGEST_FIRST_NAME = 8;
    private static final int LONGEST_LAST_NAME = 12;


    @Override
    public String getShortcut() {
        return "5";
    }

    @Override
    public String getLabel() {
        return "Generate Random Name";
    }

    @Override
    public boolean execute() {
        // generate randomNumbers
        // map them to letters
        // receive randomName firsName with 4-8 letters
        // receive randomName secondName with 4-12 letters
//        int upperCaseA = 'A';
//        char x = 65;
//        char a = 'A';
        int randomNameLength = Generator.generateRandomNumber(SHORTEST_NAME, LONGEST_FIRST_NAME);
        String firstName = "";
        for (int i = 0; i < randomNameLength; i++) {
            if (i == 0) {
                firstName += (char) Generator.generateRandomNumber('A','Z');
            }
            else {
                firstName += (char) Generator.generateRandomNumber('a', 'z');
            }
        }
        print(firstName);
        return false;
    }
}
