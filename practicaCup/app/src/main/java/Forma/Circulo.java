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
public class Circulo extends Formas {

    private int radio;

    public Circulo(int posX, int posY, String color,String forma, int radio) {
        super(posX,posY,color,forma);
        this.radio = radio;
    }
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }


}
