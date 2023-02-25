package org.maze;

import org.maze.levels.LevelOne;
import org.maze.playgame.Game;

// first. create a class that will hold a 'level design' which is simply a 2d array
// the second class holds some various tools to manipulate and display any 2d array that is passed into it.
// one of the tools is: loadLevel. it takes the 2d array, assigns it to a new field (gameMap) and initializes a few other defaults
// now that the 2d array, and its defaults, is initialized, we can now use another tool to manipulate gameMap.
// the next tool is: getUserInput. it takes a string input by the user. conditionals based on that string then manipulate gameMap
// those conditionals inside getUserInput will manipulate more than 1 time, and prompt for more input each time.
// the next tool is: printSquare. it converts the 2d array into a line of strings. it breaks down the lines by the total length
// the final piece is: gameLoop.
// it just loops through the 2 tools, getUserInput and printSquare.
//
// todo: more conditionals for maze walls, boundaries, etc.
// todo: try catch


public class Main {
    public static void main(String[] args) {

        LevelOne levelOne = new LevelOne();
        Game game = new Game();

        game.loadLevel(levelOne.getLevelOneMaze());
        game.gameLoop();

    }
}