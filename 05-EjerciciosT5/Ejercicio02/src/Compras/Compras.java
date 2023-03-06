package Compras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Compras {

    private double presupuesto;
    private ArrayList<Double> precios;
    
    public static double sumapre = 0;
    public Compras(double presupuesto){
        
        this.presupuesto=presupuesto;
        this.precios = new ArrayList<Double>();
    }
    public void reguistrarCompra(double dinero)throws Exception{
        
        for(double x : precios){
      
            Compras.sumapre+=x;
        }
        
        if((Compras.sumapre + dinero) < this.presupuesto){
            
            this.precios.add(dinero);
        }else{
            throw new Exception("No hay suficiente presupuesto para comprar");
        }
        
        Compras.sumapre=0;
    }
    public ArrayList getPrecio(){
        return this.precios;
    }
}
