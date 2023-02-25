package org.maze.playgame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PlayGame {

    // ok so the method takes an input, and then it changes the indexOf array blah blah
//    static Scanner input = new Scanner(System.in);

    public String levelStarter (String[][] level){
        Scanner input = new Scanner(System.in);
//        Boolean validChoice = false;
        int userPositionRow = 0;
        int userPositionColumn = 0;


        if (level[9][0] != "X"){
//            int userPositionRow = 0;
//            int userPositionColumn = 0;

            System.out.println(printSquare(level));
            System.out.println("\n W\nASD\nMove Through the Maze!");
            String searchTerm = input.nextLine();

            if (searchTerm.equals("W")){
                // if input is W, then we increase row, and change the level[][]
                userPositionRow = userPositionRow -1;
//                level[userPositionRow][userPositionColumn] = "X";
            } else if (searchTerm.equals("A")){
                userPositionColumn = userPositionColumn -1;
//                level[userPositionRow][userPositionColumn] = "X";
            } else if (searchTerm.equals("S")){
                userPositionRow = userPositionRow +1;
//                level[userPositionRow][userPositionColumn] = "X";
            } else if (searchTerm.equals("D")){
                userPositionColumn = userPositionColumn +1;
//                level[userPositionRow][userPositionColumn] = "X";
            }
        }
        level[userPositionRow][userPositionColumn] = "X";
        return printSquare(level);
    }




//    public String userInput2 (String input, String[][] level){
//        int userPositionRow = 0;
//        int userPositionColumn = 0;
//        String errorMessage = "";
//        // close friend of mine told me that i need to try catch LITERALLY EVERY METHOD. LOL
//        try {
//            // so, like, we are going to pass in, as a parameter, the user's selection of WASD
//            // and then we also have to pass in levelOne.getLevelOneMaze()
//            // and then we can do levelOne.setLevelOneMaze()
//            // i think that if i pass in the getter, and then i change it and do the setter
//            // doesnt the setter, like change it and then i can get it 15 times and its always the change i made?
//            // then i change it again with the setter and then i can get the new one 15 times, etc.
//            // so first we do. IF [9][8] != "X", then we do the rest of the input jazz
//            if (level[9][0] != "X"){
//                if (input == "W" && userPositionRow != 0){
//                    // if input is W, then we increase row, and change the level[][]
//                    userPositionRow = userPositionRow +1;
//                    level[userPositionRow][userPositionColumn] = "X";
//                } else if (input == "A" && userPositionColumn != 0){
//                    userPositionColumn = userPositionColumn -1;
//                    level[userPositionRow][userPositionColumn] = "X";
//                } else if (input == "S" && userPositionRow != 9){
//                    userPositionRow = userPositionRow +1;
//                    level[userPositionRow][userPositionColumn] = "X";
//                } else if (input == "D" && userPositionColumn != 9){
//                    userPositionColumn = userPositionColumn +1;
//                    level[userPositionRow][userPositionColumn] = "X";
//                } else {
//                    errorMessage = "dude.... input something real";
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e);
//            return "See error below.";
//        }
//        return errorMessage;
//    }




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
