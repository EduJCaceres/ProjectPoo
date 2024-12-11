/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.Deporte;
import Enumeradores.Paises;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Edu
 */
public class Entrenador extends Persona implements Comparable<Entrenador>{
    private Deporte especialidad;
    private Paises pais;
    private LocalDate fecNac; //Fecha de Nacimiento
    
    public Entrenador(){
        super();
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }


    public Deporte getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Deporte especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
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
