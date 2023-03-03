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
     //Geters
     public String getNombre(){
         return this.nombre;
     }
     public DNI getDNI(){
         return this.dni;
     }
     public double getSueldo(){
         return this.sueldo;
     }
     public LocalDate getFechaNacimento(){
         return this.fechaNacimiento;
     }
     public CuentaCorriente getCuentaCorriente(){
         return this.cuenta;
     } 
     //
     public boolean esMayorEdad(){
        boolean mayor = true;
        LocalDate año  = LocalDate.now();
        if(año.getYear()-this.fechaNacimiento.getYear()>=18){
            return mayor;
            
        }else{
            mayor = false;
            return mayor;
        }
     }
     public boolean tieneDinero(){
         boolean dinero = true;
         if(this.cuenta.getSaldo()>=0){
             return dinero;
         }else{
             dinero = false;
             return dinero;
         }   
     }
      public boolean esMileurista(){
        boolean saldo = true;
        if(this.sueldo < 1200){
           return saldo;
        }else{
            saldo = false;
            return saldo;
        }
    }
     @Override
     public String toString(){
        
        String aux = "El nombre es " +nombre+ " con DNI " +dni+ 
                " fecha de nacimiento " +fechaNacimiento+ 
                " con el sueldo " +sueldo;
        
        return aux;
    }
}
