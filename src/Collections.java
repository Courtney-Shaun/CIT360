import java.util.*;

public class Collections {


        public static void main(String[] args) {
                System.out.println("**** Array List *****");
                System.out.println("Emter a number between 0 and 9 to print a players name to the screen.");
                Scanner numEntry = new Scanner(System.in);
                int choice = numEntry.nextInt();


                List players = new ArrayList();
                players.add("Carson Wentz");
                players.add("Miles Sanders");
                players.add("DeSean Jackson");
                players.add("Alshon Jeffery");
                players.add("Lane Johnson");
                players.add("Brandon Brooks");
                players.add("Jason Kelce");
                players.add("Isaac Seumalo");
                players.add("Jason Peters");
                players.add("Carson Wentz");

                Object entry = players.get(choice);
                if (choice <= 9) {
                        System.out.println("player is " + entry);
                }

                System.out.println("***** Set *****");

                Set playerSet = new TreeSet();
                playerSet.add("Carson Wentz");
                playerSet.add("Miles Sanders");
                playerSet.add("DeSean Jackson");
                playerSet.add("Alshon Jeffery");
                playerSet.add("Carson Wentz");
                playerSet.add("Lane Johnson");
                playerSet.add("Brandon Brooks");
                playerSet.add("Jason Kelce");
                playerSet.add("Isaac Seumalo");
                playerSet.add("Jason Peters");

                //Print list using an iterator
                Iterator offense = playerSet.iterator();

                System.out.println("--- Players sorted alphabetically by first name and duplicate entries removed ---"  + "\r");
                while (offense.hasNext()) {
                        System.out.println(offense.next() + "\r");
        }


                }

                //Set- Cannot contain duplicate entries.  If a second entry is added that is a duplicate it will be ignored.
        }




