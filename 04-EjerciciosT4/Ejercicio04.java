
package ejercicio04;
import Persona.Persona;
import java.time.LocalDate;
import DNI.DNI;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI pd1 = new DNI ("54236235G");
        DNI pd2 = new DNI ("54236235G");
        
        Persona p1 = new Persona("pepe",pd1,2222,LocalDate.of(2000,2,12));
        Persona p3 = new Persona("pepe",pd2);
        Persona p2 = new Persona("pepe",54236235,'G',900,LocalDate.of(2000,2,12));
        Persona p4 = new Persona("pepe",54236235,'G');
        
    }

}
