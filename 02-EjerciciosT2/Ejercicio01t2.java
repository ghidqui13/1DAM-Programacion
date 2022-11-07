/*

 */
package ejercicio01t2;
import bpc.daw.mario.*; 
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio01t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Mario m1, m2 = null;
        Luigi l1 = null;
        Seta s1, s2 = null;
        Cañon c1 = null; 
        Disparo d1 = null;
        Planta p1 = null;
        
        
        
        //metodo de constructor por defecto
        
        m1 = new Mario();
        l1 = new Luigi();
        
        // metodo constructor por parametro
        
        m2 = new Mario(1500,820);
        s1 = new Seta (882,444);
        d1.getX();
        s1.pensar();
        d1.pensar();
        
        
    }
    
}
