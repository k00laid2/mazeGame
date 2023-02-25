package org.maze;

import org.maze.levels.LevelOne;
import org.maze.playgame.PlayGame;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LevelOne levelOne = new LevelOne();
        PlayGame playGame = new PlayGame();


        System.out.println(playGame.levelStarter(levelOne.getLevelOneMaze()));





    }
}