package ejercicio11;
import EquipoFutbol.CabreoException;
import EquipoFutbol.Empleado;
/**
 *
 * @author hidal
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Jose", 1200.00);
        
        try{
            empleado.cobrar(500.00);
        }catch(CabreoException e){
            System.out.println(e.getMessage());
        }
        try{
            empleado.cobrar(1500.00);
        }catch(CabreoException e){
            System.out.println(e.getMessage());
        }
        System.out.println(empleado.getDinero());
        System.out.println(empleado);
        
    }
    
}
