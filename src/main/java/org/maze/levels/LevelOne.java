package org.maze.levels;

import java.util.Arrays;

public class LevelOne {
    // i think i need a field of the X string
    // i think i need to have a field that shows level[0][0] = "X"



    // an array that holds 10 arrays inside it
    // each of the 10 arrays, has 10 elements inside it
    // to access 1 cell, array.indexOfRow, column etc
    private String[][] levelOneMaze = {
            // [0,0]
            {"X", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
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


    public LevelOne() {
    }
    public String[][] getLevelOneMaze() {
        return levelOneMaze;
    }
    public void setLevelOneMaze(String[][] levelOneMaze) {
        this.levelOneMaze = levelOneMaze;
    }

}
