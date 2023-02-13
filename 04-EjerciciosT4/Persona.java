package Persona;
import DNI.DNI;
import java.time.LocalDate;
import CuentaCorriente.CuentaCorriente;
/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private DNI dni;
    private CuentaCorriente cuenta;
    
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
        sueldo =1000;
    }
     public Persona(String n, int  numeroDNI ,char letraDNI){
        nombre = n;
        dni = new DNI (numeroDNI,letraDNI);
    }
     public void aumentarSueldo(int porcentaje){
        double op = this.sueldo / ((double)porcentaje * 100);
        this.sueldo += op;
     }
     public void cobrarSueldo(){
         this.cuenta.AñadirDinero((int)this.sueldo);
     }
     @Override
     public String toString(){
        
        String aux = "El nombre es " +nombre+ " con DNI " +dni+ 
                " fecha de nacimiento " +fechaNacimiento+ 
                " con el sueldo " +sueldo;
        
        return aux;
    }
}
