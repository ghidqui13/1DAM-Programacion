
package ejercicio10;
import Persona.Persona;
import DNI.DNI;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DNI d1 = new DNI ("54236235G");
      
      Persona p1 = new Persona ("Gabi", d1);
      
      p1.aumentarSueldo(50);
      
        System.out.println(p1);
        
        p1.cobrarSueldo();
        
        System.out.println(p1);
    }

}
