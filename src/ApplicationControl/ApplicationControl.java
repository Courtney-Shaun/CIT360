package ApplicationControl;

import java.util.HashMap;

public class ApplicationControl {

    private HashMap<String, Handler> commands;

    public ApplicationControl() {
        commands = new HashMap<String, Handler>();
        commands.put("addPlayer", new AddPlayerHandler());
        commands.put("showPlayer", new ShowPlayerHandler());
        commands.put("showMenu", new ShowMenuHandler());
    }

    public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
        Handler command = commands.getOrDefault(commandKey, null);
        if (command == null) {
            throw new Exception("There is no command " + commandKey + " ");
        }

        return command.handleIt(commandData);
    }


}
