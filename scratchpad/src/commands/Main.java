package commands;

/**
 * Created by larissa on 25.03.16.
 */
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        Command commandA = new CommandA();
        Command commandB = new CommandB();
        button.addCommand(commandA);
        button.addCommand(commandB);
        button.onClick();
    }
}
