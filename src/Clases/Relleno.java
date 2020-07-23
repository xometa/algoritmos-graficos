/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author BONIFACIO
 */
public class Relleno {
    private int x;
    private int y;
    private int x2;
    private int y2;

    public Relleno() {
    }

    public Relleno(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void iniciales(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void finales(int x2, int y2){
        this.x2 = x2;
        this.y2 = y2;
    }
}
