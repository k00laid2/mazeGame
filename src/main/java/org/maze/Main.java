package org.maze;

import org.maze.levels.LevelOne;
import org.maze.playgame.Game;


public class Main {
    public static void main(String[] args) {

        LevelOne levelOne = new LevelOne();
        Game game = new Game();

        game.loadLevel(levelOne.getLevelOneMaze());
        game.gameLoop();



    }
}