
package ejercicio48;
import bpc.daw.objetos.*;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_LOCAL;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_VISITANTE;
import static bpc.daw.objetos.MarcadorMejorado.NORMAL;
import static bpc.daw.objetos.MarcadorMejorado.TIRO_LIBRE;
import static bpc.daw.objetos.MarcadorMejorado.TRIPLE;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcadorMejorado Partido;
        
        Partido = new MarcadorMejorado("Estudiantes","CB Granada");
        
        
        Partido.anotarCanasta(CANASTA_LOCAL,NORMAL);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_VISITANTE,TRIPLE);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_LOCAL,NORMAL);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_VISITANTE,NORMAL);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_VISITANTE,TRIPLE);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_LOCAL,TIRO_LIBRE);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_LOCAL,TIRO_LIBRE);
        System.out.println(Partido.toString());
        
        Partido.anotarCanasta(CANASTA_VISITANTE,NORMAL);
        System.out.println(Partido.toString());
        
        System.out.println("El equipo ganador es: "
                +Partido.getNombreEquipoGanador());
        
        
        System.out.println("El equipo Perdedor es: "
                +Partido.getNombreEquipoPerdedor()); 
        
    }

}
