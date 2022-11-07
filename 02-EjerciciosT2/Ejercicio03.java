/*

 */
package ejercicio03t2;
import bpc.daw.mario.*; 

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio03t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mario m1 = null;
        Seta s1= null;
        Cañon c1= null;
        Planta p1,p2,p3 = null;
        Luigi l1= null;
        
        s1= new Seta(0,0);
        m1= new Mario(600,100);
        c1= new Cañon (100,600);
        l1= new Luigi (400,600);
        p1 = new Planta(400,500);
        p2 = new Planta(450,500);
        p3 = new Planta(500,500);

        s1.andarHacia(200,0);
        m1.saltar();
        c1.disparar(400, 600);
        p1.comer(true);
        p2.comer(true);
        p3.comer(true);
        
        
    }
    
}
