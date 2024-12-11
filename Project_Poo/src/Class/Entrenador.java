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
    private String especialidad;
    private String pais;
    private String fecNac; //Fecha de Nacimiento
    private String email;
    
    public Entrenador(){
        super();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
