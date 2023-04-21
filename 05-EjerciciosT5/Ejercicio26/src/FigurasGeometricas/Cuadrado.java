package FigurasGeometricas;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Cuadrado extends Rectangulo {
    
    private int longitudLado;
    
    
    public Cuadrado(Point esi, int longitudLado, Color c) {
        super(esi, new Point(esi.x + longitudLado, esi.y + longitudLado), c);
    }   

}
