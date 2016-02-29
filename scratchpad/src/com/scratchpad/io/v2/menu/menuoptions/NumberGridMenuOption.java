package com.scratchpad.io.v2.menu.menuoptions;

/**
 * Created by larissa on 19/02/2016.
 */
public class NumberGridMenuOption extends MenuOption {

    private int[][] grid = new int[][] {
        { 10, 11, 12, 13 },
        { 20, 21, 22, 23 },
        { 30, 31, 32, 33 },
        { 40, 41, 42, 43 }
    };

    @Override
    public String getDescription() {
        return "Show Number Grid";
    }

    @Override
    public boolean execute() {
//        for (int h = 0; h < grid.length; h++) {
//            int[] row = grid[h];
//            for (int w = 0; w < row.length; w++) {
//                System.out.print(row[w] + " ");
//            }
//            System.out.println();
//        }

        for (int h = 0; h < grid.length; h++) {
            for (int w = 0; w < grid[h].length; w++) {
                System.out.print(grid[h][w] + " ");
            }
            System.out.println();
        }

        return false;
    }
}
