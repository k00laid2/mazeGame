package org.maze.background;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Background {

    // an array that holds 10 arrays inside it
    // each of the 10 arrays, has 10 elements inside it
    // to access 1 cell, array.indexOfRow, column etc

    private String[][] bgSquare = {
            // [0,0]
            {"O", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"O", "|", "O", "O", "O", "|", "O", "O", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "O", "O", "|", "O", "|"},
            {"O", "O", "O", "-", "-", "-", "-", "-", "O", "-"},
    };

        public String printSquare() {
            try {
                String collector = "";
                for (int i = 0; i < bgSquare.length; i++) {
                    collector = collector + (Arrays.toString(bgSquare[i])) + "\n";
                }
                return collector;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
                return "See error below.";
            }
        }


    public Background() {
    }


    public String[][] getBgSquare() {
        return bgSquare;
    }

    public void setBgSquare(String[][] bgSquare) {
        this.bgSquare = bgSquare;
    }
}
