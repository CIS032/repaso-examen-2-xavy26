/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgraficas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author miltonlab
 */
public class Graficador {
   
    ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
    
    private String archivo;

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
  
    public void agregarFigura(FiguraGeometrica f){
        this.figuras.add(f);
        this.grabar();
       
    }
    public void mover(double x, double y){
        for (FiguraGeometrica figura : figuras) {
            figura.mover(x, y);
        }
        this.grabar();
    }
    
    public void grabar() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);    
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e);
        }
        for (FiguraGeometrica figura : figuras) {
            String linea = "";
            if (figura instanceof Cuadrado){
                Cuadrado c = ((Cuadrado)figura);
                linea = "Cuadrado;" + figura.nombre + ";" + 
                        c.vertice1 + c.vertice2 + c.vertice3 + c.vertice4;
            }
            if (figura instanceof Circulo) {
                Circulo c = ((Circulo)figura);
                linea = "Circulo;" + figura.nombre + ";" + c.centro;
            }
            pw.println(linea);
        }
        pw.close();
    }
    
    public void recargar (){
        /*
         * Completar este método: 
         * El objetivo es leer todos los datos del archivo de texto 
         * y crear los objetos 'FiguraGeometrica' para agregarlos a
         * la colección 'figuras'
        */
    }
}
