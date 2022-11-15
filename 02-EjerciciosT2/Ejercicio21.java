/*

 */
package ejercicio21;
import java.util.*;
import java.io.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String Rutas = new Scanner(System.in).nextLine();
        
        File ruta = new File(Rutas);        
        
        if(ruta.isDirectory()){
           File lista[] = ruta.listFiles();  
           System.out.println("Total archivos y carpetas: "+lista.length); 
        }else{
            System.out.println("Error no es un directorio");
             }
    }
    
}
