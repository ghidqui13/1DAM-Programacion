
package ejercicio27;
import java.net.*;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Escribe una direccion IP ");
        String IP = new Scanner(System.in).nextLine();
        
        System.out.println("Introduzca un timeout (en milisegundos):");        
        int timeout = new Scanner(System.in).nextInt();                
        
        try{
           InetAddress a = InetAddress.getByName(IP);
  
           boolean ping = a.isReachable(timeout);
            
            if(ping){
                System.out.println("Se puede hacer el ping");
            }else{
                System.out.println("No se puede hacer ping");
            }
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
       
    }

}
