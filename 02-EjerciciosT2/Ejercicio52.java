
package ejercicio52;
import java.util.*;
import java.awt.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Map<String,Color> matrícula = new HashMap<String,Color>();
       
       matrícula.put("12535ABC", Color.red);
       matrícula.put("98525KWX", Color.yellow);
       matrícula.put("17632MSE", Color.green);
       matrícula.put("85321ABC", Color.yellow);
       
        System.out.println("El tamaño del mapa es: "+matrícula.size());
        
        System.out.println(matrícula.toString());
        
        matrícula.values();
        
        System.out.println("Introduzca matricula");
        String coche = new Scanner(System.in).nextLine();
        
        if(matrícula.containsKey(coche)){
            System.out.println(matrícula.get(coche));
        }else{
            System.out.println("No existe esa matricula");
        }
        
        
    }

}
