/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author vmware_xp
 */
public class Game {
    
    private int charPosX;
    private int charPosY;
    private boolean isAlive = true;
    
    private GameCharacter gameCharacter;
    private GameBoard gameBoard;
    
    

    public int getCharPosX() {
        return charPosX;
    }

    public void setCharMoveRight(int charPosX) {
        //needs validation for tank to remain within board.
        this.charPosX = charPosX++;
    }

    public void setCharMoveLeft(int charPosX) {
        //needs validation for tank to remain within board.
        this.charPosX = charPosX--;
    }
    
    public int getCharPosY() {
        return charPosY;
    }

    public void setCharMoveUp(int charPosY) {
        //needs validation for tank to remain within board.
        this.charPosY = charPosY++;
    }
    
    public void setCharMoveDown(int charPosY) {
        //needs validation for tank to remain within board.
        this.charPosY = charPosY--;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public void playerShot() {
        
    }
}
