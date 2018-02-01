/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgraficas;

/**
 *
 * @author miltonlab
 */
public class Punto {
    
    private Double x;

    private Double y;

    public Punto() {
    }

    public Punto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void mover(double x, double y){
        this.x += x;
        this.y += y;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
