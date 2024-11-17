/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.TurnoClase;

/**
 *
 * @author Edu
 */
public class Clase {
    private String id;
    private TurnoClase turno;
    private String duracion;
    private Entrenador entrenador;
    private InstalacionDeportiva instalacionDeportiva;

    public Clase() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public TurnoClase getTurno() {
        return turno;
    }
    
    public void setTurno(TurnoClase turno) {
        this.turno = turno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    public String mostrar() {
        return "Codigo: " + id + "\n"
                + "Turno de la Clase: " + turno + "Profesor: " + entrenador.getNombre() + ", " + entrenador.getApellido() + "\n" 
                + "Ubicacion: " + instalacionDeportiva.getUbicacion();
    }
}
