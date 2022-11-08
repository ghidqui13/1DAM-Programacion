/*

 */
package ejercicio18;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String correo;
        System.out.println("Cual es tu nombre");
        correo = new Scanner(System.in).nextLine();
        
        int arroba =correo.indexOf("@");
        String nombre = correo.substring(0,arroba);
        String dominio = correo.substring(arroba+1,correo.length());
        
        System.out.println("Tu nombre es: " +nombre);
        System.out.println("Tu dominio es: " +dominio);

    }
    
}
