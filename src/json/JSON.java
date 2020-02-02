/* Program will take and object with 3 parameters and transform it into JSON.
 Next the program will convert the JSON back into the object.
 The program will print the contents of a string in the JSON format and
 then will print the contents of the object converted back from JSON*/


package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;

// Manipulating sample code provided by Brother Tuckett.

public class JSON {

        // Java to JSON conversion
    public static String playerToJSON(EaglesPlayer player) {

        ObjectMapper mapper = new ObjectMapper();
        String playerString ="";

        try {
            playerString = mapper.writeValueAsString(player);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return playerString;
    }
    // JSON to java conversion
    public static EaglesPlayer JSONToPlayer(String playerString) {

        ObjectMapper mapper = new ObjectMapper();
        EaglesPlayer player = null;

        try {
            player = mapper.readValue(playerString, EaglesPlayer.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }
        return player;
    }

    public static void main(String[] args) {

        EaglesPlayer play = new EaglesPlayer();
        play.setName("Carson Wentz");
        play.setNumber(11);
        play.setPosition("Quarterback");

        String json = JSON.playerToJSON(play);
        System.out.println(json);

        EaglesPlayer play2 = JSON.JSONToPlayer(json);
        System.out.println(play2);
    }





}
