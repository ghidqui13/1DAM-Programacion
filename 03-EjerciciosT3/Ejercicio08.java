
package ejercicio08;
import java.util.StringTokenizer;
import java.util.Scanner;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        StringTokenizer tokens;
        int total;
        
        System.out.println("Escribe una frase");
        frase = new Scanner(System.in).nextLine();
        
        tokens=new StringTokenizer(frase, " ");
        total=tokens.countTokens();
        
        while(tokens.hasMoreTokens()){
            
            System.out.println(tokens.nextToken());
        }
        System.out.println("El numero total de palabras es: "+total);
    }

}
