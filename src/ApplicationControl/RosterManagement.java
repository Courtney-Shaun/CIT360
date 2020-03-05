package ApplicationControl;

import java.util.HashMap;
import java.util.Scanner;

import ApplicationControl.Library;

public class RosterManagement {

    public RosterManagement() {
    }

    public static void main(String[] args) {

        ApplicationControl controller = new ApplicationControl();
        Scanner scanner = new Scanner(System.in);
        Library playerLib = new Library();

        try {

            int action = -1;
            while (action != 0) {
                action = (int)controller.doCommand("showMenu", GetCommandData("scanner", scanner));
                switch (action) {
                    case 1:
                        controller.doCommand("showPlayer", GetCommandData("library", playerLib));
                        break;
                    case 2:
                        HashMap<String, Object> commandData = GetCommandData("scanner", scanner);
                        commandData.put("library", playerLib);
                        controller.doCommand("addPlayer", commandData);
                        break;
                    case 0:
                        System.out.println("Thank you for using the System.");
                        break;
                    default:
                        System.out.println("Selection not available.  Please try again.");
                        break;

            }

        }

    } catch (Exception e) {
            System.err.println(e.toString());
    }
    finally {
            scanner.close();
    }
}

public static HashMap<String, Object> GetCommandData(String key, Object value) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put(key, value);
        return data;
}
}
