/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forma;

/**
 *
 * @author meza4
 */
public class Linea extends Formas {
    private int posX1;
    private int posY1;

    public Linea(int posX1, int posY1, int posX, int posY, String color, String forma) {
        super(posX, posY, color, forma);
        this.posX1 = posX1;
        this.posY1 = posY1;
    }

    public int getPosX1() {
        return posX1;
    }

    public void setPosX1(int posX1) {
        this.posX1 = posX1;
    }

    public int getPosY1() {
        return posY1;
    }

    public void setPosY1(int posY1) {
        this.posY1 = posY1;
    }
    
    
}
