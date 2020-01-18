import java.util.*;
public class Collections {


        public static void main(String[] args) {
                System.out.println("Array List");

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

                //Print list using an iterator
                Iterator iterator = players.iterator();

                System.out.println("Eagles Offense" + "\r");
                while (iterator.hasNext()) {
                        System.out.println(iterator.next() + "\r");
                }
        }

}


