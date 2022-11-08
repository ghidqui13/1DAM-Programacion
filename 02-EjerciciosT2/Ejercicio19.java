/*

 */
package ejercicio19;
import java.util.*;
import java.io.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File ruta;
        
        System.out.println("Cual es la ruta");
        String rutas = new Scanner(System.in).nextLine();
        
        ruta = new File ( rutas );
        
        System.out.println("la ruta del archivo pesa " +ruta.length()+ " bytes");
        
        int megabyte = (int)(ruta.length()/10000000);
        
        System.out.println("la ruta del archivo pesa " +megabyte+ " megabytes");

        
         
        
    }
    
}
