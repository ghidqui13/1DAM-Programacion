package pystring04;
import java.util.*;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author hidal
 */
public class PyString04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una cadena con ASCII");
        String Ascii = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe una cadena con numeros ");
        int Numeracion = new Scanner(System.in).nextInt();
        
        
        byte [] cambio = Ascii.getBytes(StandardCharsets.US_ASCII);
        
        if (Ascii.length()>5){
           System.out.println("Tiene que ser mas corta");

        }else{
            System.out.println("Primer caracter: " +cambio [0]+Numeracion);
            System.out.println("Segundo caracter: " +cambio [1]+Numeracion);
            System.out.println("Tercer caracter: " +cambio [2]+Numeracion);
            System.out.println("Cuarto caracter: " +cambio [3]+Numeracion);
            System.out.println("Quinto caracter: " +cambio [4]+Numeracion);
 
        }
        
        
        
        
    }
    
}
