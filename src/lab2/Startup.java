/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vmware_xp
 */
public class Startup {
    public static void main(String[] args) {
        //create a new game.
        Game g = new Game();
       
        
        //name the 2 players created in the game class.
        g.gc1.setName("Player 1");
        g.gc2.setName("Player 2");
        //generate the game board.
        //(boardsizeX, boardsizeY, obstacleRatio)
        //Difficulty envisioning GUI interaction.
        g.gb.generateBoard(g.gui.setInput(boardSizeX), 
                g.gui.setInput(boardSizeY), g.gui.setInput(obstacleRatio));
        
    }
}
