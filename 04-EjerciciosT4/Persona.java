package Persona;
import DNI.DNI;
import java.time.LocalDate;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private DNI dni;
    
    public Persona(String n, DNI d, double s, LocalDate fn){
        nombre = n;
        sueldo = s;
        fechaNacimiento = fn;
        dni = d;
    }
    public Persona(String n, int  numeroDNI ,char letraDNI, double s, LocalDate fn){
        dni = new DNI (numeroDNI,letraDNI);
        nombre = n;
        sueldo = s;
        fechaNacimiento = fn;
    }
    public Persona(String n, DNI d){
        nombre = n;
        dni = d  ;
    }
     public Persona(String n, int  numeroDNI ,char letraDNI){
        nombre = n;
        dni = new DNI (numeroDNI,letraDNI);
    }
     @Override
     public String toString(){
        
        String aux = "El nombre es " +nombre+ " con DNI " +dni+ 
                " fecha de nacimiento " +fechaNacimiento+ 
                " con el sueldo " +sueldo;
        
        return aux;
    }
}
