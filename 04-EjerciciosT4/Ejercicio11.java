
package ejercicio11;
import Persona.Persona;
import  DNI.DNI;
import  CuentaCorriente.CuentaCorriente;
import Oficina.Oficina;
import java.time.LocalDate;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Oficina of1 = new Oficina();
        Persona p = new  Persona("Pepe",54332344,'G',1111,LocalDate.of(1985,5,25));
        of1.setEmpleado("juan","53123412G",2000,LocalDate.of(1985,5,25));
        
        of1.setEmpleado(p);
        
        System.out.println(of1);
        
    }

}
