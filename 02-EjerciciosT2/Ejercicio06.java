/*

 */
package ejercicio06t2;
import bpc.daw.mario.*;
import java.util.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio06T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Mario m1;
        int cordenada1,cordenada2 ;
        
        System.out.println("Escribes las coedenadas en las que va a parecer mario");
        cordenada1 = new Scanner(System.in).nextInt();
        System.out.println("Escribes las coedenadas en las que va a parecer mario");
        cordenada2 = new Scanner(System.in).nextInt();
        
        m1= new Mario  (+cordenada1+cordenada2);
        
        
    }
    
}
