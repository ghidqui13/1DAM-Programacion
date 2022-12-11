
package ejercicio54;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> mensajes = new ArrayList<String>();
        
        mensajes.add("hey");
        mensajes.add("hay");
        mensajes.add("huy");
        mensajes.add("hiy");
        mensajes.add("hoy");
        mensajes.add("h1y");
        mensajes.add("h2y");
        mensajes.add("h4y");
        mensajes.add("h5y");
        mensajes.add("h6y");
        mensajes.add("h7y");
        
        System.out.println(mensajes.toString());
        
         Collections.sort(mensajes);
        
        System.out.println(mensajes.toString());
    }

}
