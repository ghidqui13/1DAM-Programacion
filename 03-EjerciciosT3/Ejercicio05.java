
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int CAZA = 30;
        int pieza = 0;
        int cantidad;
        System.out.println("El maximo de piezas que puedes cazar es 30");
        
        while(pieza<CAZA){
            
            System.out.println("Introduzca el numero de piezas que has cazado");
            cantidad= new Scanner(System.in).nextInt();
            
            if (pieza<CAZA){
                
                pieza+=cantidad;
                System.out.println("La cantidad de piezas es: " +pieza+
                " de la maxima que puedes cazar que es: " +CAZA);
                 
            }else if(pieza<0){
                
                    System.out.println("EL resultado no es valido vuelve "
                            + "a pober la cantidad");
                    
                }else if(pieza>=CAZA){
                System.out.println("La cantidad de piezas es: " +pieza+
                " de la maxima que puedes cazar que es: " +CAZA+ " a superado "
                        + "el maximo de caza ");
            }
        }
    }
}
