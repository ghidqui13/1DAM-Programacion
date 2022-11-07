/*

 */
package ejercicio05t2;
import bpc.daw.mario.*; 

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio05t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cañon c1,c2= null;
        c1= new Cañon (100,600);
        c2= new Cañon (200,600);
        
        c1.disparar(100, 800);
        c1.disparar(100, 900);
        
        c2.disparar(200, 650);
        c2.disparar(200, 700);
        c2.disparar(200, 800);
        
        int disparosc1 = c1.getTotalDisparosRealizados();
        int disparosc2 = c2.getTotalDisparosRealizados();
        
        System.out.println("Cuantos disparos ha realizado el primer cañon: " +disparosc1 );
        System.out.println("Cuantos disparos ha realizado el segundo cañon: " +disparosc2 );
        
    }
    
}
