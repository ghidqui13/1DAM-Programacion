
package ejercicio07;

import CuentaCorriente.CuentaCorriente;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente();
        
        cuenta.AñadirDinero(3000);
        
        System.out.println(cuenta.toString());
        
        cuenta.RetirarDinero(500);
         
        System.out.println(cuenta.toString());
    }

}
