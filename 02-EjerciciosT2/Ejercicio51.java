
package ejercicio51;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<String> mensajes = new HashSet<String>();
      
      mensajes.add("silla");
      mensajes.add("mesa");
      mensajes.add("niño");
      mensajes.add("mesa");
      mensajes.add("casa");
      mensajes.add("silla");
      mensajes.add("lápiz");
      
      System.out.println("El tamaño de la lista es: "+mensajes.size());
      
      System.out.println("El tamaño de la lista es: "+mensajes.toString());
    }

}
