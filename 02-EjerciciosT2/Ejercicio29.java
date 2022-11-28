
package ejercicio29;
import java.util.*;
import bpc.daw.objetos.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            System.out.println("Escribe un un numero:");
        int n = new Scanner(System.in).nextInt();
        
        }catch(Exception e){
        
            System.out.println("Error InputMismatchException: por que no es un numero");
        }
        try{
            System.out.println("Escribe los argumentos:");
            System.out.println("Argumento 1: "+ args[0]);
            System.out.println("Argumento 1: "+ args[1]);
        
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
        
            int n3 = n1 + n2;
        
            System.out.println("La suma de los argumentos es: " +n3);
        
        
        }catch(Exception e){
        
            System.out.println("Error ArrayIndexOutOfBoundsException: por que no hay argumentos");
        }
        try{
            System.out.println("Apartado C");
            Caja c = null;
            c.abrirCaja();   
            System.out.println(c.getMensaje().length());
        }catch(Exception e){
            
        System.out.println("Error NullPointerException: por que la caja esta vacia");
        }
        
    }

}
