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
public class Rectangulo extends Formas {
    private int alto;
    private int ancho;
    
     public Rectangulo(int posX, int posY, String color,String forma, int alto, int ancho) {
        super(posX,posY,color,forma);
        this.alto=alto;
        this.ancho=ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
     
     
}
