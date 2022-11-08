/*

 */
package ejercicio12;
import bpc.daw.objetos.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcadorBaloncesto marcador = new MarcadorBaloncesto("Estudiantes","CB Granada");
    
             marcador.anotarCanasta('L',2);
             marcador.anotarCanasta('V',3);
             marcador.anotarCanasta('L',2);
             marcador.anotarCanasta('V',2);
             marcador.anotarCanasta('V',3);
             marcador.anotarCanasta('L',1);
             marcador.anotarCanasta('L',1);
             marcador.anotarCanasta('V',2);
             
            System.out.println(marcador.toString());
            System.out.println("va ganando por los puntos: "+marcador.getNombreEquipoGanador());
            System.out.println("va perdiendo por los puntos: "+marcador.getNombreEquipoPerdedor());
    }
    
}
