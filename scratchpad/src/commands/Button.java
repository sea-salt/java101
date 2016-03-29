package commands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by larissa on 25.03.16.
 */
public class Button {
    private List<Command> commands;

    public Button() {
        commands = new ArrayList<>();
    }

    public void onClick() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}
