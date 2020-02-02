/* This program will take the data from the saved
* JSON file and convert it back into a Java Object that is then printed to the screen. */

package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONToObject {

    private static final String filePath = "C:\\Users\\Shaun\\Documents\\School\\CIT360\\CIT360\\src\\json\\playerJSON.json";

    public static void main(String[] args) {

        ObjectMapper mapper =new ObjectMapper();

        try {

            //Convert JSON file to Java Object
            EaglesPlayer eaglesPlayer = mapper.readValue(new File(filePath), EaglesPlayer.class);

            // Print the Object to the screen.
            String printPlayer = mapper.writeValueAsString(eaglesPlayer);
            System.out.println(printPlayer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
