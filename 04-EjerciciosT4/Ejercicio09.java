
package ejercicio09;
import MarcadorBaloncesto.Marcador;
import java.time.LocalDate;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Marcador m2 = new Marcador("Pepe","luis",LocalDate.of(2000,2,12));
         
         m2.añadirCanasta('L', 3);
         m2.añadirCanasta('V', 2);
         
         System.out.println(m2);
         
         m2.reset();
        
         System.out.println(m2);
    }

}
