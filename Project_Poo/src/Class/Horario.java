/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class Horario {
    private Alumno alumno;
    private Entrenador entrenador;
    private Clase clase;
    private InstalacionDeportiva instalacionDeportiva;
    
    public Horario(){
    }
    
    public String mostrar(String al, String dni){
        if(al.equals(alumno.getNombre()) && dni.equals(alumno.getNumDi())){
            return "Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido() + "\n" 
                    + "codigo de la Clase: " + clase.getId() + "Lugar: " + instalacionDeportiva.getTipoCampo() + "\n"
                    + "Turno: " + clase.getTurno(); 
        }
        return "";
    }
}
