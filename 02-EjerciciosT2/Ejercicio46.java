
package ejercicio46;
import java.time.*;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random numAl = new Random();
        int random = numAl.nextInt(0,10);
        
        Instant empezar = Instant.now();
        
        try{
            Thread.sleep(random*100000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        Instant terminar = Instant.now();
        
        Duration  duracion = Duration.between(terminar, empezar);
        
        System.out.println("Duracion "+duracion.getSeconds()+ "s");
    }

}
 