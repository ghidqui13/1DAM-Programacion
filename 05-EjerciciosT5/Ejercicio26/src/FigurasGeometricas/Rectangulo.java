package FigurasGeometricas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Rectangulo implements Centrable, Apoyable {
    
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    public Rectangulo(Point esquinaSuperiorIzquierda,
            Point esquinaInferiorDerecha, Color color){
        
        this.esquinaInferiorDerecha = esquinaInferiorDerecha;
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.color = color;
    }
    
    @Override
    public Point getCentro() {
        int x = (int) 
        (this.esquinaSuperiorIzquierda.getX() + this.esquinaInferiorDerecha.getX() / 2);
        int y = (int) 
        (this.esquinaSuperiorIzquierda.getY() + this.esquinaInferiorDerecha.getY() / 2);
        return new Point(x, y);    
    }

    @Override
    public int getLongitudBase() {
        int aux;
        aux = (int)this.esquinaInferiorDerecha.x - (int) this.esquinaSuperiorIzquierda.x;
        return aux;
    }

    @Override
    public int getLongituAltura(){
        int aux;
        aux =(int)this.esquinaInferiorDerecha.y - (int) this.esquinaSuperiorIzquierda.y;
        return aux;
    }

    @Override
    public double getArea(){
        return this.getLongituAltura() * this.getLongitudBase();
    }

    @Override
    public int getPerimetro(){
        return 2 * (this.getLongituAltura() * this.getLongitudBase());
    }

    @Override
    public void dibujar(Graphics g){
        g.create();
    }

    @Override
    public Color getColor() {
        return this.getColor();
    }

}
