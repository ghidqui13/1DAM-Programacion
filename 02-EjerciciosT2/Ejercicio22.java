/*

 */
package ejercicio22;
import bpc.daw.objetos.*; 
import java.util.InputMismatchException;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito t1;
        
        t1 = new TarjetaCredito(5000,1111);
        
        System.out.println("escrive la contraseña");
        int c = new Scanner(System.in).nextInt();
        
        
        
        try{
            System.out.println(  t1.getSaldo(c));
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        try{
            System.out.println(  t1.sacarDinero(2000,1111));
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        try{
            System.out.println(  t1.getSaldo(c));
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
        
        
    }
    
}
