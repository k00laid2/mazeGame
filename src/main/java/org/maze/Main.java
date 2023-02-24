package org.maze;

import org.maze.levels.LevelOne;


public class Main {
    public static void main(String[] args) {
        LevelOne levelOne = new LevelOne();
        PlayGame playGame = new PlayGame();

        System.out.println(playGame.printSquare(levelOne.getLevelOneMaze()));



    }
}