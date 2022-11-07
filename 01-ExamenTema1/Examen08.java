/*

 */
package examen08;

/**
 *
 * @author Gabriel
 */
public class Examen08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] vocales={'a','b','c','d','e'};
        double [] decimales={23,45,23,5.5,32};
        String [] lenguajes={"php","java","html","python","c++"};
        
        System.out.println("La ultima de las vocales es " +vocales[4] );
        System.out.println("La ultima de decimal es " +decimales[4] );
        System.out.println("La ultima de los lenguajes es " +lenguajes[4]);
        
        lenguajes[0]="Cobol";
        
        System.out.println("La primera de los lenguajes es " +lenguajes[0]);

    }
    
}
