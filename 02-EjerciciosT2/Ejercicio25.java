/*

 */
package ejercicio25;
import java.io.*;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File archivo = new File("C:/Users/Gabriel/Desktop/frases.txt");
                
       try{
             
          Scanner frase = new Scanner(archivo);
          System.out.println(frase.next());
          System.out.println(frase.next());
          frase.close();
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        } 
        
    }
    
}
