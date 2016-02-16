package com.scratchpad.io.v2.menu.menuoptions;

public abstract class MenuOption {
    private static int globalId;
    private final int personalId;

    public MenuOption() {
        globalId++;
        personalId = globalId;
    }

    /**
     * @return the menu option's keyboard shortcut
     */
    public String getShortcut() {
        return personalId + "";
    }

    /**
     * @return the menu option's label
     */
    public abstract String getDescription();

    /**
     * Executes the menu option.
     *
     * @return true if the program should exit
     */
    public abstract boolean execute();

    protected void print(Object object) {
        System.out.println(object);
    }

    @Override
    public String toString() {
        return getShortcut() + " - " + getDescription();
    }
}
