
package ejercicio01;
import DNI.DNI;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI n1 = new DNI(54236235, 'g');
        
        DNI n2 = new DNI("54236235g");
        
        System.out.println(n1.getnumero());
        System.out.println(n1.getletra());
        
    }

}
