package FigurasGeometricas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Circulo implements FiguraGeometrica, Centrable {

       private Point centro;
       private int radio;
       private Color color;
       
       
       public Circulo(Point centro, int radio, Color Color){
           this.centro = centro;
           this.color = color;
           this.radio = radio;
       }

    @Override
    public double getArea() {
         double aux;
         aux = 3.1416 * Math.pow((double)this.radio,2);
         return aux;
    }

    @Override
    public int getPerimetro() {
         double aux;
         aux = 2 *  3.1416 * this.radio;
         return (int) aux;
    }

    @Override
    public void dibujar(Graphics g) {
        g.create();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
}
