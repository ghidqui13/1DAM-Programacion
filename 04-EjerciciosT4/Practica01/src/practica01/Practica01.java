
package practica01;
import Dominos.FichaDominos;
import Incidencia.Incidencia;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
        inc2.Resuelve("El equipo no estaba enchufado");
        inc3.Resuelve("Cambio del cable VGA");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + inc1.getPendientes());   
        
        
        
        
        
        
        FichaDominos f1 = new FichaDominos(6,1);
        FichaDominos f2 = new FichaDominos(0,4);
        FichaDominos f3 = new FichaDominos(3,3);
        FichaDominos f4 = new FichaDominos(0,1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea()); 
        
    }

}
