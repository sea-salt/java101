package com.scratchpad.io.v2.menu.menuoptions;

public abstract class MenuOption {

    /**
     * @return the menu option's keyboard shortcut
     */
    public abstract String getShortcut();

    /**
     * @return the menu option's label
     */
    public abstract String getLabel();

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
        return getShortcut() + " - " + getLabel();
    }
}
