/*

 */
package ejercicio08;
import bpc.daw.objetos.*;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua d1=null;
        DepositoAgua d2=null;
        
        d1 = new DepositoAgua(15,20);
        d2 = new DepositoAgua(5,20);
        
        
        System.out.println("la cantidad de litros de el primer deposito es: " +d1.getCantidadActual());
        d1.dibujar();
        
        System.out.println("la cantidad de litros de el primer deposito es: " +d2.getCantidadActual());

        d2.dibujar();
        
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        
        
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        
        System.out.println("la cantidad de litros de el primer deposito despues de quetarle los cinco litros es  es: " +d1.getCantidadActual());
        d1.dibujar();
        
        
        System.out.println("la cantidad de litros de el segundo deposito despues de añadirlo los cinco litros restados al primero  es: " +d2.getCantidadActual()); 
        d2.dibujar();
        
    }
    
}
