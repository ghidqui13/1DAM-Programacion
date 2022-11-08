/*

 */
package ejercicio17;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, dominio;
        
       System.out.println("Cual es tu nombre");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("Cual es tu dominio");
        dominio = new Scanner(System.in).nextLine();
        
        if (dominio.endsWith(".es")|| dominio.endsWith(".com")){
              System.out.println(nombre+"@"+dominio);
        }else{
              System.out.println("El dominio no es valido");

        }
        
        
        
    }
    
}
