/*

 */
package ejercicio11;
import bpc.daw.objetos.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1,c2;
        
        c1 = new Caja ("Hola que tal");
        c2 = new Caja ("Que tal fue");
        
       c1.abrirCaja();
       c2.abrirCaja();
       
       String m1 = c1.getMensaje();
       String m2 = c2.getMensaje();
       
       System.out.println("el mensaje de la caja 1 es: "+c1.getMensaje());
       System.out.println("el mensaje de la caja 2 es: "+c2.getMensaje());
       
       
       c1.cambiarMensaje(m2);
       c2.cambiarMensaje(m1);
          
        
       System.out.println("el mensaje de la caja 1 es: "+c1.getMensaje());
       System.out.println("el mensaje de la caja 2 es: "+c2.getMensaje());
        
    }
    
}
