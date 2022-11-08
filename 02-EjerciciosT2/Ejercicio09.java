/*

 */
package ejercicio09;
import bpc.daw.objetos.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1;
        
        c1 = new Caja ("Bienvenidos al instituto");
       
        c1.cerrarCaja();
        
        System.out.println("El mensaje que contiene la caja es: " +c1.getMensaje());
        
        c1.abrirCaja();
        
        System.out.println("El mensaje que contiene la caja es: " +c1.getMensaje());
    }
    
}
