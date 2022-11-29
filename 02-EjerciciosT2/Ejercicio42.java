
package ejercicio42;
import java.util.*; 
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int PRIMERO = 29; 
        final int SEGUNDO= 65;
        Random numAl = new Random(); 
        
       System.out.println("Un numero ramdom entre 29 y 65");
    try{
       int ramdom2 =numAl.nextInt(PRIMERO,SEGUNDO);
       System.out.println("Un numero ramdom  con la clase ramdom "+ramdom2);
    }catch(Exception e){
        System.out.println("Error " +e.getLocalizedMessage());
    }
    }
}
