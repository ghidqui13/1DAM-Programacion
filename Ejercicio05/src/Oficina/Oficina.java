package Oficina;
import DNI.DNI;
import Persona.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Oficina {
    private String nombre;
    private ArrayList<Persona>trabajadores;
    private int tipo;
    
    
    public Oficina(String n){
        nombre = n;
    }
    public Oficina (String n, int t){
        tipo = t;
        nombre = n;
        
        DNI pd1 = new DNI ("11111111H");
        DNI pd2 = new DNI ("22222222J");
        DNI pd3 = new DNI ("33333333P");
        
        
        trabajadores = new ArrayList<Persona>();
        
        switch(tipo){
            case 0 : 
                trabajadores = null;
            
            case 1 : 
                trabajadores.add(new Persona("Antonio Pérez Pérez",pd1,900,LocalDate.of(2000,2,28)));
                break;
            case 2 : 
                trabajadores.add(new Persona("Antonio Pérez Pérez",pd1,900,LocalDate.of(2000,2,28)));
                trabajadores.add(new Persona("Luis López López",pd2,1000,LocalDate.of(1995,9,10)));
                break;
            case 3 : 
                trabajadores.add(new Persona("Antonio Pérez Pérez",pd1,900,LocalDate.of(2000,2,28)));
                trabajadores.add(new Persona("Luis López López",pd2,1000,LocalDate.of(1995,9,10)));
                trabajadores.add(new Persona("Ana Díaz Díaz",pd3,1200,LocalDate.of(1985,5,25)));
        }
    }
    public Oficina(){
        
        nombre = "1DAM";
        
        DNI pd1 = new DNI ("11111111H");
        DNI pd2 = new DNI ("22222222J");
        DNI pd3 = new DNI ("33333333P");
        trabajadores = new ArrayList<Persona>();
        
        
        trabajadores.add(new Persona("Antonio Pérez Pérez",pd1,900,LocalDate.of(2000,2,28)));
        trabajadores.add(new Persona("Luis López López",pd2,1000,LocalDate.of(1995,9,10)));
        trabajadores.add(new Persona("Ana Díaz Díaz",pd3,1200,LocalDate.of(1985,5,25)));
    }
    
     @Override
    public String toString(){
        
        String aux = "El nombre es " +nombre+ "\n";
        
        for (Persona p : trabajadores){
            aux += p.toString();
        }
        return aux;
    }
}
