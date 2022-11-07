/*

 */
package ejercicio07;
import bpc.daw.objetos.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       bpc.daw.objetos.DepositoAgua d1=null;
       double porcentaje;
        
        d1 = new DepositoAgua(15,50);
        
        d1.dibujar();
        d1.getCantidadActual();
        d1.getCapacidadMaxima();
        
        porcentaje = (15 * 100 )/50;
        
        System.out.println("El porcentaje de agua es: " +porcentaje+ "%");
        
        
    }
    
}
