package ejercicio01;
import Sorteo.Sorteo;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio01 {
    public static void main(String[] args) {
     
        Sorteo s = new Sorteo(12.50,30);
        

        s.apuntarNuevoParticipante();
        s.registrarPago();
        
        System.out.println(s);
    }
}
