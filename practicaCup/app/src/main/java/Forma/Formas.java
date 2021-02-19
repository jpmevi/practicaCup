/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forma;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author meza4
 */
public class Formas implements Serializable {
    private int posX;
    private int posY;
    private String color;
    private String forma;

    public Formas(int posX, int posY, String color, String forma) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
        this.forma= forma;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

   

   

    
}
