package org.maze.levels;

import java.util.Arrays;

public class LevelOne {
    private String[][] levelOneMaze = {
            // [0,0]
            {"X", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"O", "|", "O", "O", "O", "|", "O", "O", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"$", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "|", "O", "|", "O", "O", "O", "|", "O", "|"},
            {"O", "O", "O", "-", "-", "-", "-", "-", "$", "-"},
    };


    public LevelOne() {
    }
    public String[][] getLevelOneMaze() {
        return levelOneMaze;
    }
}
