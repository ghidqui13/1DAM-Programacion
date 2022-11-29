
package ejercicio43;
import java.math.*;
import java.text.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        NumberFormat num = NumberFormat.getInstance();
       
        double resultado = 4 * Math.atan(1);
        
        num.setMaximumFractionDigits(4);
        
        System.out.println("El resultado es "+ num.format(resultado));
    }

}
