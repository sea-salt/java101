package com.scratchpad.io.v2.menu.menuoptions;

public class ExitMenuOption extends MenuOption {

    @Override
    public String getShortcut() {
        return "x";
    }

    @Override
    public String getLabel() {
        return "Exit";
    }

    @Override
    public boolean execute() {
        System.out.println("\nGoodbye!");
        return true;
    }
}