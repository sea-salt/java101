package com.scratchpad.io.v2.menu.menuoptions;

/**
 * Created by larissa on 29.02.16.
 */
public class PrintWeekMenuOption extends MenuOption {

    private enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    @Override
    public String getDescription() {
        return "Print days of the week";
    }

    @Override
    public boolean execute() {
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            print(dayOfWeek);
        }
        return false;
    }
}
