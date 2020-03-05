package ApplicationControl;

import java.util.HashMap;
import java.util.Scanner;

import ApplicationControl.Player;
import ApplicationControl.Handler;
import ApplicationControl.Library;


public class AddPlayerHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Scanner scanner = (Scanner) data.get("scanner");
        Library playerLib = (Library) data.get("library");

        System.out.println("Enter player name: ");
        String name = scanner.nextLine();
        System.out.println("Enter players position: ");
        String position = scanner.nextLine();
        System.out.println("Enter the players number");
        int playerNum = scanner.nextInt();

        Player newPlayer = new Player(name, position, playerNum);
        playerLib.addPlayers(newPlayer);
        return null;

    }


    ;



}
