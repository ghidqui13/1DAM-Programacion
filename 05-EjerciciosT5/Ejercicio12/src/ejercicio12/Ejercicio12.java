package ejercicio12;
import EquipoFutbol.CabreoException;
import EquipoFutbol.Empleado;
import EquipoFutbol.EmpleadoPrimable;

/**
 *
 * @author hidal
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Jose", 1200.00);
        EmpleadoPrimable empleado2 = new EmpleadoPrimable("Jose", 1200.00);
        try{
            empleado.cobrar(1500.00);
        }catch(CabreoException e){
            System.out.println(e.getMessage());
        }
        try{
            empleado2.cobrar(500.00);
        }catch(CabreoException e){
            System.out.println(e.getMessage());
        }
        try{
            empleado2.cobrar(1500.00);
        }catch(CabreoException e){
            System.out.println(e.getMessage());
        }
        empleado2.primar();
        System.out.println(empleado2);
        System.out.println(empleado.getDinero());
        System.out.println(empleado);
    }
    
}
