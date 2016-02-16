package com.scratchpad.io.v2.menu.menuoptions;

import java.util.Scanner;

/**
 * Created by larissa on 16/02/2016.
 */
public class GridMenuOption extends TwoNumberMathMenuOption {
    public GridMenuOption(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getDescription() {
        return "Create Grid";
    }

    @Override
    public int calculate(int width, int height) {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("u");
            }
            System.out.println();
        }

        return width * height;
    }
}
