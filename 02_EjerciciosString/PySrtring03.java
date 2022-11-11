package pysrtring03;
import java.util.*;

/**
 *
 * @author hidal
 */
public class PySrtring03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe una frase para traducir al Latin");
        String traductor = new Scanner(System.in).nextLine();
        
        char V1 = 'a';
        char V2 = 'e';
        char V3 = 'i';
        char V4 = 'o';
        char V5 = 'u';
        
        int ultimaL = traductor.length()-1;
        
        char ultimaV = traductor.charAt(ultimaL);
        
        if( ultimaV == V1){
            System.out.println("Frase traducida= " +traductor.substring(0, traductor.length()-1)+"us");

        }else{
            if( ultimaV == V2){
             System.out.println("Frase traducida= " +traductor.substring(0, traductor.length()-1)+"us");

            }else{
                if( ultimaV == V3){
             System.out.println("Frase traducida= " +traductor.substring(0, traductor.length()-1)+"us");

                }else{
                    if( ultimaV == V4){
             System.out.println("Frase traducida= " +traductor.substring(0, traductor.length()-1)+"us");

                    }else{
                        if( ultimaV == V5){
             System.out.println("Frase traducida= " +traductor.substring(0, traductor.length()-1)+"us");
 
                        }else{
             System.out.println(traductor+"us");

                        }
                    }
                }
            }
        }
        
    }
    
}
