
package ejercicio31;
import bpc.daw.musica.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Piano p = new Piano();
        Guitarra g = new Guitarra();
        Cancion c ;
        String n = "Cancion";
        
     
        c = new Cancion(n);
        
        NotaMusical don = new NotaMusical(0,2);
        NotaMusical don2 = new NotaMusical(0,2);
        NotaMusical soln = new NotaMusical(4,2);
        NotaMusical soln2 = new NotaMusical(4,2);
        NotaMusical lan = new NotaMusical(5,2);
        NotaMusical lan2 = new NotaMusical(5,2);
        NotaMusical solb = new NotaMusical(4,1);
        NotaMusical fan = new NotaMusical(3,2);
        NotaMusical fan2 = new NotaMusical(3,2);
        NotaMusical min = new NotaMusical(2,2);
        NotaMusical min2 = new NotaMusical(2,2);
        NotaMusical ren = new NotaMusical(1,2);
        NotaMusical min3 = new NotaMusical(2,2);
        NotaMusical fan3 = new NotaMusical(3,2);
        NotaMusical ren2 = new NotaMusical(1,2);
        NotaMusical don3 = new NotaMusical(0,2);
        
        c.añadir(don);
        c.añadir(don2);
        c.añadir(soln);
        c.añadir(soln2);
        c.añadir(lan);
        c.añadir(lan2);
        c.añadir(solb);
        c.añadir(fan);
        c.añadir(fan2);
        c.añadir(min);
        c.añadir(min2);
        c.añadir(ren);
        c.añadir(min3);
        c.añadir(fan3);
        c.añadir(ren2);
        c.añadir(don3);
        
        p.reproducir(c);
        
        System.out.println("ha terminado el piano empieza la guitarra");
        
        g.reproducir(c);
         
    }

}
