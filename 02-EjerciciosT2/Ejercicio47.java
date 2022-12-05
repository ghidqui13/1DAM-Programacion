
package ejercicio47;
import java.awt.*;
import java.io.File;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Desktop ruta = Desktop.getDesktop();
                 
        System.out.println("Escribe un aruta");
        String rutas =  new Scanner(System.in).nextLine();
        
        File R = new File(rutas);
        
        try{
            ruta.open(R);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      
    }

}
