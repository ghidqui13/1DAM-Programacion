
package ejercicio41;
import java.math.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = 0.38;
        double b = 4.93;
        double resultado, calculado;
        
        
        resultado = (a * b);
        
        calculado = (resultado)*Math.exp(-0.36);
        
        System.out.println("El resultado normal es: " +calculado);
        
        double entero = Math.round(calculado);
        
        System.out.println("El resultado mas cercano al entero es: " +entero);
        
    }

}
