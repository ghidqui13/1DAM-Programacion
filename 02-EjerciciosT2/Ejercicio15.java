/*

 */
package ejercicio15;
import java.util.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave = "Hola";
        
        System.out.println("Escribe la contraseña");
        String contraseña = new Scanner(System.in).nextLine();
        
        if( contraseña.equals(clave) ) {
                    System.out.println("El inicio de sesion ha sido correcto");

        }else{
                    System.out.println("El inicio de sesion no ha sido valido");

        }
        
    }
    
}
