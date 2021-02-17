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
public class Cuadrado extends Formas{
    private int tamanioLado;
    
    public Cuadrado(int posX, int posY, String color,String forma, int tamanioLado) {
        super(posX,posY,color,forma);
        this.tamanioLado = tamanioLado;
    }

    public int getTamanioLado() {
        return tamanioLado;
    }

    public void setTamanioLado(int tamanioLado) {
        this.tamanioLado = tamanioLado;
    }
    
}
