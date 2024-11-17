/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Edu
 */
public class Entrenador extends Persona implements Comparable<Entrenador>{
    private String especialidad;
    private String fecNac; //Fecha de Nacimiento
    public static ArrayList<Entrenador> entrenador = new ArrayList<>();
    
    public Entrenador(){
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }
    
    @Override
        public int compareTo(Entrenador aux) {
            return super.getApellido().compareTo(aux.getApellido());
        }
        
    @Override
        public String Persona() {
            return super.Persona() + "Especialidad: " + especialidad;
        }
}
