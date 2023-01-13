package ejercicio01;
import  java.util.Scanner;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] musica = {
        
        "Gonner.mp3",
        "Bote.mp3",
        "Callaita.mp3",
        "Shark.mp3",
        "Enemy.mp3" 
    };  
      
        System.out.println("Eligue una cancion entre estas");
        System.out.println("--------------------");
        System.out.println("-- 1-Gonner.mp3   --");
        System.out.println("-- 2-Bote.mp3     --");
        System.out.println("-- 3-Callaita.mp3 --");
        System.out.println("-- 4-Shark.mp3    --");
        System.out.println("-- 5-Enemy.mp3    --");
        System.out.println("--------------------");
        
        System.out.println("Eligue una de estas canciones "
                + "solo se admiten numeros"); 
        int n = new Scanner(System.in).nextInt();
       
        try{
            
            switch(n){
                case 1:
                    System.out.println("Reproduccin cacion 1: " +musica[0]);
                case 2:
                    System.out.println("Reproduccin cacion 2: " +musica[1]);
                case 3:
                    System.out.println("Reproduccin cacion 3: " +musica[2]);
                case 4:
                    System.out.println("Reproduccin cacion 4: " +musica[3]);
                case 5:
                    System.out.println("Reproduccin cacion 5: " +musica[4]);
           
            }catch(Exception e){      
                System.out.println("No has introducido un numero "
                        + "y tampoco as escogido una cancion ");
            }
        }
    }

}
