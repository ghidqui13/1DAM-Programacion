
package ejercicio50;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      ArrayList<String> mensajes = new ArrayList<String>();
      
      mensajes.add("hola");
      mensajes.add("Que");
      mensajes.add("Tal");
      mensajes.add("Llevas");
      mensajes.add("El dia");
      
      System.out.println("El tamaño de la lista es: "+mensajes.size());
      
      System.out.println("La tercera posicion de la lista contiene: "
              +mensajes.get(2));
      
      System.out.println("El tamaño de la lista es: "+mensajes.toString());
      
      mensajes.remove(0);
      
      System.out.println("El tamaño de la lista es: "+mensajes.size());
      
      System.out.println("La tercera posicion de la lista contiene: "
              +mensajes.get(2));
      
      System.out.println("El tamaño de la lista es: "+mensajes.toString());
    }

}
