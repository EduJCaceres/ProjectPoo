/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class Entrenador extends Persona{
    private String especialidad;
    private String fecNac; // Fecha de Nacimiento
    
    public Entrenador(String user, String password){
        super(user,password);
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
    public String Persona() {
        return super.Persona() + "Especialidad: " + especialidad;
    }
    
}
