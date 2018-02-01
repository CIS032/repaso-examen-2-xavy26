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
public class Cuadrado extends FiguraGeometrica {

    Punto vertice1;
    Punto vertice2;
    Punto vertice3;
    Punto vertice4;

    public Cuadrado(Punto vertice1, Punto vertice3) {
        
        this.vertice1 = vertice1;
        this.vertice2 = new Punto(vertice3.getX(),vertice1.getY());
        this.vertice3 = vertice3;
        this.vertice4 = new Punto(vertice1.getX(),vertice3.getY());;
    }
    
    
    @Override
    public void mover(double dx, double dy) {
        this.vertice1.mover(dx, dy);
        this.vertice2.mover(dx, dy);
        this.vertice3.mover(dx, dy);
        this.vertice4.mover(dx, dy);
    }

    @Override
    public String toString() {
        return "[" + vertice1 + "," + vertice2 + "," + vertice3 + "," + vertice4 + ']';
    }
    
    
}
