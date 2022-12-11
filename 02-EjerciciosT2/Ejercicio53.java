
package ejercicio53;
import java.util.*;
import java.awt.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final Color ROJO = Color.RED;
        final Color AMARILLO = Color.YELLOW;
        final Color VERDE = Color.GREEN;
        
        
       TreeMap<String,Color> matrícula = new TreeMap<String,Color>();
       
       matrícula.put("12535ABC", ROJO);
       matrícula.put("98525KWX", AMARILLO);
       matrícula.put("17632MSE", VERDE);
       matrícula.put("85321ABC", AMARILLO);
       
       System.out.println("El tamaño del TreeMap es: "+matrícula.size());
        
       System.out.println(matrícula.toString());
        
        
       System.out.println("Estructuralmente hay diferencias entre el HashMap y "
               + "el TreeMap,pero en este ejercicio no se aprecia ninguna "
               + "diferencia");
        
        
    }
    

}
