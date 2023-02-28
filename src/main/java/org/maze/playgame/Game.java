package org.maze.playgame;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public String[][] gameMap;
    int userPositionRow;
    int userPositionColumn;
    String errorMessage;
    Scanner input = new Scanner(System.in);

    public String[][] loadLevel(String[][] level) {
        this.gameMap = level;
        this.userPositionRow = 0;
        this.userPositionColumn = 0;
        this.errorMessage = null;
        return this.gameMap;
    }

    public boolean isValidMove(int nextRow, int nextColumn){
        if (nextRow < 0 || nextColumn < 0 || nextRow > gameMap.length-1 || nextColumn > gameMap[nextRow].length-1) {
            errorMessage = "WOA DON'T FALL OFF THE MAP.";
            return false;
        }
        if ((gameMap[nextRow][nextColumn]) == "-" || (gameMap[nextRow][nextColumn]) == "|") {
            errorMessage = "THAT'S A WALL, MOVE A DIFFERENT DIRECTION";
            return false;
        }
        if ((gameMap[nextRow][nextColumn]) == "$") {
            errorMessage = "THE END OF THE MAP! GOOD JOB DUDE!";
            return false;
        }
        userPositionRow = nextRow;
        userPositionColumn = nextColumn;
        return true;
    }

    public boolean getUserInput(){
        errorMessage = null;
        gameMap[userPositionRow][userPositionColumn] = "O";
        System.out.println("\n W\nASD\nMove Through the Maze!");
        String searchTerm = input.nextLine();
            switch (searchTerm.toUpperCase()) {
                case "W":
                    isValidMove(userPositionRow-1, userPositionColumn);
                    break;
                case "A":
                    isValidMove(userPositionRow, userPositionColumn-1);
                    break;
                case "S":
                    isValidMove(userPositionRow+1, userPositionColumn);
                    break;
                case "D":
                    isValidMove(userPositionRow, userPositionColumn+1);
                    break;
                case "K":
                    isValidMove(userPositionRow+2, userPositionColumn+1);
                    break;
                case "E":
                    isValidMove(userPositionRow-1, userPositionColumn-1);
                    break;
            }
            gameMap[userPositionRow][userPositionColumn] = "X";
            return true;
    }

    public String printSquare(String[][] level) {
        try {
            String collector = "";

            for (int i = 0; i < level.length; i++) {
                collector = collector + (Arrays.toString(level[i])) + "\n";
            }
            if (errorMessage != null){
                collector = collector + errorMessage + "\n";
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
