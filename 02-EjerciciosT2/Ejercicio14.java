/*

 */
package ejercicio14;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println("Letra que hay justo a la mitad de la frase: "+frase.charAt(frase.length()/2)); 
        
    }
    
}
