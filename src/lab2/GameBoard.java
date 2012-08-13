/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vmware_xp
 */
public class GameBoard {
    
    private int boardSizeX = 10;
    private int boardSizeY = 10;
    private double obstacleRatio = 0;
    private double numberOfObstacles;
    
    public void generateBoard(int boardSizeX, int boardSizeY, double obstacleRatio){
       this.numberOfObstacles = (boardSizeX * boardSizeY * obstacleRatio);
       
    }
}
