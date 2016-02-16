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
    public String getDescription() {
        return "Generate Random Name";
    }

    @Override
    public boolean execute() {
        String firstName = Generator.generateRandomName(SHORTEST_NAME, LONGEST_FIRST_NAME);
        String lastName = Generator.generateRandomName(SHORTEST_NAME, LONGEST_LAST_NAME);
        print(firstName + " " + lastName);
        return false;
    }
}
