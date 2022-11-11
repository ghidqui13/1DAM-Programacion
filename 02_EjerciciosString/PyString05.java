package pystring05;
import java.util.*;

/**
 *
 * @author hidal
 */
public class PyString05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase");
        String F = new Scanner(System.in).nextLine();
        
        F = F.toLowerCase().replace("á","a" ).replace("é","e" ).replace("í","i" ).replace("ó","o" ).replace("ú","u" ).replace(" ","" )
                .replace(".","" ).replace(",","" );
        
        String Invertir = new StringBuilder(F).reverse().toString();
        
        if(Invertir.equals(F)){
                    System.out.println("La frase es palindroma");
        }else{
            System.out.println("La frase no es palindroma");

        }
        
    }
    
}
