
package ejercicio44;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       LocalDate fechadia = LocalDate.now();
       
       String formaFecha1 = "dd/MM/yyyy";
       String formaFecha2 = "dd-MM-yyyy";
       
       String cambio = fechadia.format
        (DateTimeFormatter.ofPattern(formaFecha1));
       
       System.out.println("La fecha es "+cambio);
        
       String cambio2 = fechadia.format
        (DateTimeFormatter.ofPattern(formaFecha2));
      
      
       System.out.println("La fecha es "+cambio2);
    }

}
