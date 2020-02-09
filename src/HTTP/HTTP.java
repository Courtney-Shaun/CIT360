package HTTP;

import java.io.*;
import java.net.*;
import java.util.*;

public class HTTP {
    public static void main(String[] args) throws IOException {

        String userChoice =" ";

        System.out.println("This program will get a random Jeopardy clue when the user preses y");
        // Prompt user to select y to start the pull
        Scanner input = new Scanner(System.in);
        System.out.println("Enter y to get a Jeopardy clue that aired on television.");

        userChoice = input.next();

            try {
                //  Connect to the jservice.io API to pull the clue in JSON string format using the GET method.
                URL url = new URL("http://jservice.io/api/random");
                HttpURLConnection webConnection = (HttpURLConnection) url.openConnection();
                webConnection.setConnectTimeout(5000);
                webConnection.setRequestMethod("GET");
                // Get response from the page
                String pageResponse = webConnection.getResponseMessage();
                //If not found message received print that the page no longer exists.
                if (pageResponse.equals("Not Found")) {
                    System.out.println("Page no longer exists.\n");
                 }

                // Display the JSON string pulled from the API
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(webConnection.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
                System.out.println("Enjoy your trivia!  Connection is closing!\n");
                in.close();

                // Close the connection
                webConnection.disconnect();
            // Catch IO exceptions and print
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


}





