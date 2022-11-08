/*

 */
package ejercicio16;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String T1,T2;
        
        System.out.println("Escribe el primer texto");
        T1 = new Scanner(System.in).nextLine();
        System.out.println("Escribe el segundo texto");
        T2 = new Scanner(System.in).nextLine();
        
        int texto = T1.indexOf(T2);
        
        if (texto == -1){
            System.out.println("El primer texto tiene palabras o caracteres en el dos");

        }else{
            System.out.println("El primer texto no tiene palabras o caracteres en el dos");
        }
        
    }
    
}
