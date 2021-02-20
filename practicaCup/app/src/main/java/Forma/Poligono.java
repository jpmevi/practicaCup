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
public class Poligono extends Formas {
    private int alto;
    private int ancho;
    private int cantLados;

    public Poligono(int posX, int posY, int alto, int ancho, int cantLados, String color, String forma) {
        super(posX, posY, color, forma);
        this.alto = alto;
        this.ancho = ancho;
        this.cantLados = cantLados;
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

    public int getCantLados() {
        return cantLados;
    }

    public void setCantLados(int cantLados) {
        this.cantLados = cantLados;
    }
   
    
}
