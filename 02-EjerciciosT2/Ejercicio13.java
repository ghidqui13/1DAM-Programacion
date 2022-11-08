/*

 */
package ejercicio13;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Escribe tu nombre y apellido");
        String NombreA = new Scanner(System.in).nextLine();
        
        System.out.println("Tu nombre en mayusculas: " +NombreA.toUpperCase());
        System.out.println("Tu nombre en minuscula: " +NombreA.toLowerCase());
        System.out.println("Tu nombre el numero: " +NombreA.length());

    }
    
}
