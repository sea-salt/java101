package com.scratchpad.io.v2.menu.menuoptions;

/**
 * Created by larissa on 05.03.16.
 */
public class SwitchStatementMenuOption extends MenuOption {

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
        return "Switch Statement Exercise";
    }

    @Override
    public boolean execute() {
        String currentDay = "Tuesday";
        switch (currentDay) {
            case "Monday":
                print("It's Monday");
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                print("It's the middle of the week");
                break;
            case "Friday":
                print("Yay, it's Friday!");
                break;
            default:
                print("It's the weekend");
        }

//        DayOfWeek currentDay = DayOfWeek.SATURDAY;
//        switch (currentDay) {
//            case MONDAY:
//                print("It's Monday");
//                break;
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//                print("It's the middle of the week");
//                break;
//            case FRIDAY:
//                print("Yay, it's Friday!");
//                break;
//            default:
//                print("It's the weekend");
//        }


//        if (currentDay == DayOfWeek.MONDAY) {
//            print("It's Monday");
//        }
//        else if (currentDay == DayOfWeek.TUESDAY
//                || currentDay == DayOfWeek.WEDNESDAY
//                || currentDay == DayOfWeek.THURSDAY) {
//            print("It's the middle of the week");
//        }

        return false;
    }
}
