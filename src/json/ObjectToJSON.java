/*This program will take a Java Object and convert it to a JSON file stored in the specified location.  It will then print the
* contents of the file to the screen.  */

package json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectToJSON {

    private static final String filePath = "C:\\Users\\Shaun\\Documents\\School\\CIT360\\CIT360\\src\\json\\playerJSON.json";

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        EaglesPlayer eaglesPlayer2 = createEaglesPlayer();

        try {

            mapper.writeValue(new File(filePath),  eaglesPlayer2);


            String playerString = mapper.writeValueAsString(eaglesPlayer2);

            System.out.println(eaglesPlayer2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static EaglesPlayer createEaglesPlayer() {

        EaglesPlayer eaglesPlayer2 = new EaglesPlayer();

        eaglesPlayer2.setName("Miles Sanders");
        eaglesPlayer2.setNumber(26);
        eaglesPlayer2.setPosition("Running Back");

        return eaglesPlayer2;
    }
}