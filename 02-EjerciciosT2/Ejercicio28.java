
package ejercicio28;
import java.net.*;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe una direccion DNS");
        String DNS = new Scanner(System.in).nextLine();                
        
        try{
           InetAddress a = InetAddress.getByName(DNS);
           
           
           System.out.println("El host: " +DNS+ " tiene la siguiente direccion ip " +a.getHostAddress());
           
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

}