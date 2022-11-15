/*

 */
package ejercicio20;
import java.util.*;
import java.io.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                File ruta;
                
        System.out.println("Cual es la ruta");
        String rutas = new Scanner(System.in).nextLine();
        
        ruta = new File ( rutas );
        
        
        if (ruta.exists()&& ruta.isDirectory()){
            System.out.println("La ruta introducida corresponde a un directorio");
        }else{
            if(ruta.exists()&& ruta.isFile()){
                System.out.println("La ruta introducida es un archivo de tamaño "+ruta.length()+" bytes");
                System.out.println("¿Desea borrarlo? (si/no");
                String validacion = new Scanner(System.in).nextLine();
                if( validacion.equals("si")){
                    ruta.delete();
                    if(ruta.delete()){
                        System.out.println("Hubo un error no se pudo borrar");
                    }else{
                       System.out.println("Se ha borrado correctamente"); 
                    }
                }else{
                    System.out.println("Borrado cancelado");
                }
            }
        }
    }
    
}
