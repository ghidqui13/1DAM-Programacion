package EquipoFutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Hidalgo <hidalgoquinterogabriel@gmail.com>
 */
public class EquipoFutbol {

    //Atributos
    
        private String nombre;
        private List<Empleado> empleados;
        private double presupuesto;
        
    //Constructor

        public EquipoFutbol(String nombre, double presupuesto){
            
            this.nombre = nombre;
            this.presupuesto = presupuesto;
            this.empleados = new ArrayList<>();
        }
        
        
    //Getters
        
        public String getEmpleados(){
            
            for(Empleado empleado : this.empleados){
                
                if (empleado instanceof Entrnador){
                    empleado.toString();
                    
                }else if(empleado instanceof Futbolista){
                    empleado.toString();
                }
            }
            return "";
        }
        
        public double getPresupuesto(){
            
            return this.presupuesto;
        }
        
    //Metodos normales
        
        public void addEmpleado(Empleado empleado){
            
            for(Empleado empleados : this.empleados){
                 if(empleados instanceof Entrnador){
                     this.addEmpleado(empleado);
                 }else if(empleados instanceof Futbolista){
                     this.addFutbolista(empleado);
                 }else{
                     this.empleados.add(empleado);
                 }
            }
        }
        
        public void pagarEmpleado(Empleado empleado){
            
        }
        
        
    //Metodos privados
        
        //**
        /*
        /*Creamos este medodo para comprobar si es entrenador y añadirlo
        /*sin nigun problema
        /*
        */
        public void addEntrnador(Empleado empleado){
            
            int numeroEmEntre= 0;
            
            if(empleado instanceof Entrnador ){
               for(Empleado empleados : this.empleados){
                
                 if(empleados instanceof Entrnador){
                     numeroEmEntre++;
                 }
               }
            
                 if(numeroEmEntre>=1){
                    IllegalArgumentException e =new IllegalArgumentException
                    ("Este equipo ya tiene un Entrenador");
                   }
                else{
                   empleados.add(empleado);
              }
            }

        }
        
        //**
        /*
        /*Creamos este medodo para comprobar si es Futbolista y añadirlo
        /*sin nigun problema
        /*
        */
        private void addFutbolista(Empleado empleado){
            
            int numeroEmFut= 0;
            
            if(empleado instanceof Futbolista){
                for(Empleado empleados : this.empleados){
                
                    if(empleados instanceof Futbolista){
                    numeroEmFut++;
                    }
                }
                if(numeroEmFut>=25){
                IllegalArgumentException exc=new IllegalArgumentException
                    ("Este equipo ya tiene 25 jugadores");
                }
                else{
                    empleados.add(empleado);
                }
            }
        }
}
