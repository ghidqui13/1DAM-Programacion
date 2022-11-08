/*

 */
package ejercicio10;
import bpc.daw.objetos.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Caja c1;
                
                c1 = new Caja ("Hola que tal");
                
                c1.abrirCaja();
                
                System.out.println("El mensaje que contiene la caja es: " +c1.getMensaje());
                
                c1.cambiarMensaje("Que tal fue el dia");
                
                System.out.println("El mensaje que contiene la caja es: " +c1.getMensaje());

   

    }
    
}
