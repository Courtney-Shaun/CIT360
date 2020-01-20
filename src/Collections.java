import java.util.*;

public class Collections {


        public static void main(String[] args) {
                System.out.println("Array List");
                Scanner numEntry = new Scanner(System.in);
                int choice = numEntry.nextInt();
                System.out.println("Emter a number between 0 and 8");

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

                Object entry = players.get(choice);
                if (choice < 9) {
                        System.out.println("player is " + entry);
                } else if (choice >= 9){
                        System.out.println(" number is not valid.");
                }


                //Print list using an iterator
                //Iterator offense = players.iterator();

                //System.out.println("Eagles Offense" + "\r");
                //while (offense.hasNext()) {
                //        System.out.println(offense.next() + "\r");
                }

                //Set
        }




