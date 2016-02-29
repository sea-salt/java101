package com.scratchpad.io.v2.menu.menuoptions;

/**
 * Created by larissa on 19/02/2016.
 */
public class NumberGridMenuOption2 extends MenuOption {

    private static final int WIDTH = 4;

    private int[] grid = new int[] {
        10, 11, 12, 13, 20, 21, 22, 23, 30, 31, 32, 33, 40, 41, 42, 43
    };

    @Override
    public String getDescription() {
        return "Show Another Number Grid";
    }

    @Override
    public boolean execute() {
        // print index 0-3, new line, 4-7, new line etc.
        int amountOfRows = grid.length / WIDTH;

        for (int h = 0; h < amountOfRows; h++) {
            for (int w = 0; w < WIDTH; w++) {
                System.out.print(grid[h * WIDTH + w] + " ");
            }
            System.out.println();
        }

        return false;
    }
}
