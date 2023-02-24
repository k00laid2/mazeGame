package org.maze;

import java.util.Arrays;

public class PlayGame {


    // so one of the methods is just to print the square out.
    // so i think that i need to alter the square right before it gets printed.
    // so, if i change and then SET the levelOneMaze, then i should be able to pass in
    // pass in the brand new levelOneMaze array that i set. so it will print out the new one. 
    public String printSquare(String[][] level) {
        try {
            String collector = "";
            // had an example of the printStackTrace. i <= bg
            for (int i = 0; i < level.length; i++) {
                collector = collector + (Arrays.toString(level[i])) + "\n";
            }
            return collector;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return "See error below.";
        }
    }
}
