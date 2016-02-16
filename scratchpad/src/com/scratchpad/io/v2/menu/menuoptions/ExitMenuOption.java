package com.scratchpad.io.v2.menu.menuoptions;

public class ExitMenuOption extends MenuOption {

    @Override
    public String getShortcut() {
        return "x";
    }

    @Override
    public String getDescription() {
        return "Exit";
    }

    @Override
    public boolean execute() {
        print("\nGoodbye!");
        return true;
    }
}
