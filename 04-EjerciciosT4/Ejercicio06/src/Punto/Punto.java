package Punto;
import  java.awt.*;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Punto {
    private int X;
    private int Y;
    
    public Punto(){
     Point p = new Point(0 , 0 );
    }
    public Punto(int x , int y){
        X = x;
        Y = y;
     Point p = new Point(0 , 0 );
     
     if(Toolkit.getDefaultToolkit().getScreenSize().getWidth()> x
             ||
        Toolkit.getDefaultToolkit().getScreenSize().getHeight()> y){
         
         p= new Point(Toolkit.getDefaultToolkit().getScreenResolution(),
                 Toolkit.getDefaultToolkit().getScreenResolution());
     }
     else{
           p = new Point(x , y );      
                 }
    }
    public Punto(Punto p){
        p.X= p.X/2;
        p.Y= p.Y/2;
    }
    public Punto(double angulo,double distancia){
       
        X = (int)(distancia *Math.cos(angulo));
        Y = (int)(distancia *Math.sin(angulo));
        
    }
    
}
