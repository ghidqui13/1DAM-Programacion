/*

 */
package ejercicio02t2;
import bpc.daw.mario.*; 
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio02t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Mario m1,m2,m3 = null;
        Seta s1= null;
        Cañon c1= null;
        Planta p1,p2,p3 = null;
        Luigi l1= null;
       
        
        m1 = new Mario(100,0);
        m2 = new Mario(640,320);
        s1 = new Seta(0,0);
        c1 = new Cañon(100,320);
        p1 = new Planta(400,500);
        p2 = new Planta(450,500);
        p3 = new Planta(500,500);
        l1 = new Luigi(200,0);
        m3 = new Mario(200,50);
        
    }
    
}
