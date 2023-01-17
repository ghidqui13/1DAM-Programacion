
package ejercicio09;
import java.math.*;
import java.util.Scanner;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double S = 1;
       double A = 1;
       double N;
       boolean repetir  = true;
       System.out.println("Dime un valor que darle a N");
       N = new Scanner(System.in).nextDouble();
       
       if(N>=0){
           while(repetir){
               S = 0.5*(A + (N/A));
                    if((Math.abs(S-A)) < 0.000001){
                    repetir=false;
                } 
               do{
                  A=S; 
            }while((Math.abs(S-A)) > 0.000001); 
            }
        System.out.println("La raiz cuadrada aproximada es "+S);
        System.out.println("El programa ha terminado");   
       }
    }

}
