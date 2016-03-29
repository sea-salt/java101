package commands;

/**
 * Created by larissa on 27.03.16.
 */
public class CommandA implements Command, Duck {

    @Override
    public void execute() {
        System.out.println("Command A");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
