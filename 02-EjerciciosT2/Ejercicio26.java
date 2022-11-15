/*

 */
package ejercicio26;
import java.util.*;
import java.util.InputMismatchException;


/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread dormir;
        
        System.out.println("escribe Cuanto queres esperar");
         long Dormir = new Scanner(System.in).nextLong();
         
         try{
             dormir = new Thread();
             dormir.sleep(Dormir*120);
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        } 
        System.out.println("Programa finalizado");

    }
    
}
