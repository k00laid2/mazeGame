package org.maze.levels;

public class LevelTwo {
    private String[][] levelOneMaze = {
            // [0,0]
            {"X", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"O", "O", "O", "O", "O", "|", "O", "O", "O", "|"},
            {"O", "O", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "O", "O", "|", "O", "|", "O", "|", "O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "O", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "O", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "O", "O", "O", "O", "|", "O", "|", "O", "|", "O", "|", "O", "|"},
            {"O", "O", "O", "O", "$", "|", "O", "|"},
            {"O"},
            {"O", "O", "O", "-", "-", "-"},
            {"O", "O", "O", "-"},
            {"O", "O", "-"},
            {"O", "O", "-"},
            {"O"},
    };


    public LevelTwo() {
    }
    public String[][] getLevelOneMaze() {
        return levelOneMaze;
    }
}
