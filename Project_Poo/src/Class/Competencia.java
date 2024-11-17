/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author Edu
 */
public class Competencia {
    private String deporte; //nombre del deporte que participara
    private Date fecha;
    private Date hora;
    private String lugar; // Ubicacion donde se realizara el campeonato
    private String categoria;
    private Alumno alumno;
    
    public Competencia(String deporte, String lugar){
        this.deporte = deporte;
        this.lugar = lugar;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public boolean agregarAlumnosParticipantes(String dni, String lastName){
        if(dni.equalsIgnoreCase(alumno.getNumDi()) && lastName.equalsIgnoreCase(alumno.getApellido())){
            alumno.setCompetencia(true);
            return alumno.getCompetencia();
        }else {
            alumno.setCompetencia(false);
            return alumno.getCompetencia();
        }
    }
    
    public String mostrarCampeonato(){
        return "Deporte: " + deporte + "Fecha: " + fecha + "Hora: " + hora + "Lugar: " + lugar + "Categoria: " + categoria;
    }
}
