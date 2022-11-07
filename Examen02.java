
package examen02;
import java.util.*;
/**
 *
 * @author Gabriel
 */
public class Examen02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      System.out.println("****************************"); 
      System.out.println("*                          *"); 
      System.out.println("* Gabriel Hidalgo Quintero *"); 
      System.out.println("*                          *"); 
      System.out.println("****************************"); 
      
      
      
      System.out.println("**********faltas*************");
      int faltas=new Scanner(System.in).nextInt();
      System.out.println("**********leido*************");
      double leido=new Scanner(System.in).nextDouble();
      System.out.println("**********verdadero************");
      boolean verdadero=new Scanner(System.in).nextBoolean();
      System.out.println("***********Correo*************");
      long Correo=new Scanner(System.in).nextLong();
      System.out.println("***********gorras**********");
      short gorras=new Scanner(System.in).nextShort();
     
      
      
      System.out.println("*********faltas************ " +faltas );
      System.out.println("*********leido************* " +leido);
      System.out.println("*********verdadero********* " +verdadero);
      System.out.println("*********Correo************ " +Correo);
      System.out.println("*********gorras************ " +gorras);

    }
    
}
