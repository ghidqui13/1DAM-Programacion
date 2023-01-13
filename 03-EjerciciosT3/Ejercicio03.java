
package ejercicio03;

import java.util.Random;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa generara un numero aleatorio"
                + " entre el 0 y 10 y el mismo termina cuando genere el "
                + "numero 10");
        
        Random aleatorio = new Random(); 
        int N= 0;
        
        do{
            N = aleatorio.nextInt(0,11);
            System.out.println("El numero es: " +N);
        }while(N<10);
        
        System.out.println("El programa ha sacado el numero 10");
    }

}
