/*

 */
package ejercicio04t2;
import bpc.daw.mario.*; 

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio04t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mario m1;
        Luigi l1;
        
        
        m1= new Mario(550,0);
        l1= new Luigi (500,0);
        
        int distanciam = m1.getX();
        int distanciam2 = m1.getY();
        int distancial = l1.getX();
        int distancial2 = l1.getY();

        System.out.println("La distancia de luigi es: " +distancial );
        System.out.println("La distancia de luigi es: " +distancial2 );
        System.out.println("La distancia de Mario es: " +distanciam );
        System.out.println("La distancia de Mario es: " +distanciam2 );
        
        

    }
    
}
