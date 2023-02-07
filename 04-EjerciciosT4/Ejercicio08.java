
package ejercicio08;
import Caja.Caja;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caja c = new Caja(true, "Hola que tal");
       
      c.setMensaje("hola que tal fue el dia");
      
      c.pasarMayusculas();
      
        System.out.println(c.toString());
    }

}
