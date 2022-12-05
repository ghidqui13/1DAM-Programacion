
package ejercicio45;
import java.time.*;
import java.time.DayOfWeek;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     LocalDate fechadia = LocalDate.of(2100,02,28);
     
     DayOfWeek n = fechadia.getDayOfWeek();
     
     System.out.println("El dia de la semana en la que esta el 28/02/2100 "
     +n.name());
    }

}
