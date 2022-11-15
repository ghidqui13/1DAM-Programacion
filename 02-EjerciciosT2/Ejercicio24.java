/*

 */
package ejercicio24;
import java.io.*;
import java.util.*;
import java.util.InputMismatchException;


/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        
         
        System.out.println("escribe una frase");
         String frases = new Scanner(System.in).nextLine();
          
        System.out.println("escribe una frase");
         String frases2 = new Scanner(System.in).nextLine();
        
        
         try{
             
          PrintWriter frase = new PrintWriter("C:/Users/Gabriel/Desktop/frases.txt");
          frase.print(frases);
          frase.print(frases2);
          frase.close();
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
        
    }
    
}
