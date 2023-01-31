
package ejercicio03;
import MarcadorBaloncesto.Marcador;
import java.time.LocalDate;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marcador m1 = new Marcador("Pepe","luis");
        Marcador m2 = new Marcador("Pepe","luis",LocalDate.of(2000,2,12));
        Marcador m3 = new Marcador("Pepe",25,"luis",20,LocalDate.of(2000,2,12));
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        
        
    }

}
