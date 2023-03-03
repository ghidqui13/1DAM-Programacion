
package ejercicio12;

import Persona.Persona;
import java.time.LocalDate;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio12 {

    
    public static void main(String[] args) {
      Persona p = new  Persona("Pepe",54332344,'G',1111,LocalDate.of(1985,5,25));
      
      p.getNombre();
      p.getDNI();
      p.getFechaNacimento();
      p.getCuentaCorriente();
      p.esMayorEdad();
      p.esMileurista();
      p.tieneDinero();
              
    }

}
