/*

 */
package practica4;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe los grados en grados celsius");
        double celcius = new Scanner(System.in).nextDouble();
        double farenheit;
        
            farenheit = ( celcius * 9 / 5) + 32;
        
        System.out.println("Los grados en Fahrenheit= " +farenheit);

    }
    
}
