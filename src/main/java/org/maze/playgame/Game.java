package org.maze.playgame;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public String[][] gameMap;
    int userPositionRow;
    int userPositionColumn;
    Scanner input = new Scanner(System.in);
//    static Scanner input = new Scanner(System.in);

    public String[][] loadLevel(String[][] level) {
        this.gameMap = level;
        this.userPositionRow = 0;
        this.userPositionColumn = 0;
        return this.gameMap;
    }

    public boolean getUserInput(){
        if (gameMap[9][0] != "X"){
            System.out.println("\n W\nASD\nMove Through the Maze!");
            String searchTerm = input.nextLine();
            switch (searchTerm.toUpperCase()) {
                case "W":
                    // if input is W, then we increase row, and change the level[][]
                    userPositionRow = userPositionRow - 1;
                    break;
                case "A":
                    userPositionColumn = userPositionColumn - 1;
                    break;
                case "S":
                    userPositionRow = userPositionRow + 1;
                    break;
                case "D":
                    userPositionColumn = userPositionColumn + 1;
                    break;
            }
            gameMap[userPositionRow][userPositionColumn] = "X";
        }
        return true;
    }

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

    public void gameLoop(){

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(printSquare(gameMap));
        boolean shouldContinue = getUserInput();
        if (shouldContinue){
            gameLoop();
        }
    }

}
