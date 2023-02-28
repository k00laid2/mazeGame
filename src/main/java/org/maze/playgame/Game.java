package org.maze.playgame;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public String[][] gameMap;
    int userPositionRow;
    int userPositionColumn;
    Scanner input = new Scanner(System.in);

    public String[][] loadLevel(String[][] level) {
        this.gameMap = level;
        this.userPositionRow = 0;
        this.userPositionColumn = 0;
        return this.gameMap;
    }


    public boolean getUserInput(){
        if (gameMap[9][8] != "X"){
            gameMap[userPositionRow][userPositionColumn] = "O";

            System.out.println("\n W\nASD\nMove Through the Maze!");
            String searchTerm = input.nextLine();

            switch (searchTerm.toUpperCase()) {
                case "W":
                    if (userPositionRow == 0){
                        break;
                    }
                    if ((gameMap[userPositionRow-1][userPositionColumn]) == "-") {
                        break;
                    }
                    if ((gameMap[userPositionRow-1][userPositionColumn]) == "|") {
                        break;
                    }
                    userPositionRow = userPositionRow - 1;
                    break;
                case "A":
                    if (userPositionColumn == 0){
                        break;
                    }
                    if ((gameMap[userPositionRow][userPositionColumn-1]) == "-") {
                        break;
                    }
                    if ((gameMap[userPositionRow][userPositionColumn-1]) == "|") {
                        break;
                    }
                    userPositionColumn = userPositionColumn - 1;
                    break;
                case "S":
                    if (userPositionRow == 9){
                        break;
                    }
                    if ((gameMap[userPositionRow+1][userPositionColumn]) == "-") {
                        break;
                    }
                    if ((gameMap[userPositionRow+1][userPositionColumn]) == "|") {
                        break;
                    }
                    userPositionRow = userPositionRow + 1;
                    break;
                case "D":
                    if (userPositionColumn == 9){
                        break;
                    }
                    if ((gameMap[userPositionRow][userPositionColumn+1]) == "-") {
                        break;
                    }
                    if ((gameMap[userPositionRow][userPositionColumn+1]) == "|") {
                        break;
                    }
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
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(printSquare(gameMap));
        boolean shouldContinue = getUserInput();
        if (shouldContinue){
            gameLoop();
        }
    }

}
