import java.util.*;

public class Collections {


        public static void main(String[] args) {
                System.out.println("**** Array List *****");
                System.out.println("Emter a number between 0 and 9 to print a players name to the screen.");
                Scanner numEntry = new Scanner(System.in);
                int choice = numEntry.nextInt();

                // An ArrayList can contain contain duplicate entries and the maintains the insertion order.
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
                System.out.println();
                //Set- Cannot contain duplicate entries.  If a second entry is added that is a duplicate it will be ignored.
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

                System.out.println("--- Players sorted alphabetically by first name and duplicate entries removed ---" + "\r");
                while (offense.hasNext()) {
                        System.out.println(offense.next() + "\r");
                }
                System.out.println();
                // Map
                System.out.println("***** Map *****");

                //Map - Contains values based on key value pairs.  Keys in a map are unique and it is useful to be able to
                // search for, update or delete and element using the key.  A HashMap like this example will not maintain
                // any order.  A LinkedHashMap will maintain the insertion order and a TreeMap will maintain and ascending
                // order based on natural ordering.
                Map playerNum  = new HashMap();
                playerNum.put("Carson Wentz", 11);
                playerNum.put("Miles Sanders",26);
                playerNum.put("DeSean Jackson", 10);
                playerNum.put("Alshon Jeffery", 17);
                playerNum.put("Lane Johnson", 65);
                playerNum.put("Brandon Brooks", 79);
                playerNum.put("Jason Kelce", 62);
                playerNum.put("Isaac Seumalo", 73);
                playerNum.put("Jason Peters", 71);

                //Print list using an iterator
                Iterator playNum = playerNum.entrySet().iterator();

                System.out.println("Player and number:");
                while (playNum.hasNext()) {
                        Map.Entry mapPlayer = (Map.Entry)playNum.next();
                        System.out.println(mapPlayer.getKey() + " : " + mapPlayer.getValue());
                }
                System.out.println();

                // Queue - FIFO.  The queue is an ordered list that is limited to inserting elements at the end of the list and removing elements at
                // the front of the list.  In the Priority Queue elements are ordered according to their natural ordering.  In this example it will be the first
                // letter of the name.
                System.out.println("***** Queue *****");

                Queue defPlayers = new PriorityQueue();
                        defPlayers.add("Fletcher Cox");
                        defPlayers.add("Brandon Graham");
                        defPlayers.add("Fletcher Cox");
                        defPlayers.add("Malcolm Jenkins");
                        defPlayers.add("Derrick Barnett");

                        // Prints players in alphabetical order.
                        System.out.println(" Defensive Players:" + defPlayers + "\r");

                        // Remove the head of the Queue.  If the queue is empty  a NoSuchElementException will be thrown
                        System.out.println("Remove head and display it using .remove: " + defPlayers.remove());
                        // Display the new head of the Queue and remove it.  IT will return null if the queue is empty
                        System.out.println("Display new head and remove it using .poll: " + defPlayers.poll());
                        // Display the head of the queue without removing it.
                        System.out.println("First new head: " + defPlayers.peek());
                        // Display the number of elements in the queue.
                        System.out.println("Number of elements: " + defPlayers.size());

                System.out.println();
                 //TreeSet - A collection that sorts elements in their natural order.  Duplicate entries are not stored.

                System.out.println("***** TreeSet *****");
                TreeSet defensive = new TreeSet();
                defensive.add("Fletcher Cox");
                defensive.add("Brandon Graham");
                defensive.add("Fletcher Cox");
                defensive.add("Malcolm Jenkins");
                defensive.add("Derrick Barnett");

                // Print TreeSet using iterator.  Duplicate values are not accepted.
                Iterator def = defensive.iterator();
                while (def.hasNext()){
                        System.out.println(def.next());
                }

        }

 }







