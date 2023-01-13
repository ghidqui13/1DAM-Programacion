
package ejercicio04;
import java.util.Scanner;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Escribe si eres menor o mayor de edad");
        String respuesta;
        boolean empezar= true;
        
        while(empezar){
            
            System.out.println("Si/No");
            respuesta = new Scanner(System.in).nextLine();
            
            if(respuesta.equals("si") || respuesta.equals("Si")){
                System.out.println("El usuario es mayor de edad");
                empezar=false;
                }else if(respuesta.equals("no") || respuesta.equals("No")){
                    System.out.println("El usuario es menor de edad");
                    empezar=false;
                    }else{
                        System.out.println("No has respondido la pregunta");
                    }
        }
        
        
    }

}
