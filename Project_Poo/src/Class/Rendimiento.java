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
public class Rendimiento {
   private Date fecha; // Fecha de la Actualizacion de los Datos
   private int fisico; // Rendimiento Fisico
   private int tactico; // Rendimiento Tactico
   private int tecnico; // Rendimiento Tecnico
   private int psicologoco; // Rendimiento Psicologico
   private Double rendimiento; // Rendimiento total
   
   public Rendimiento(Date date, Double perfomance){
       this.fecha = date;
       this.rendimiento = perfomance;
   }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getTactico() {
        return tactico;
    }

    public void setTactico(int tactico) {
        this.tactico = tactico;
    }

    public int getTecnico() {
        return tecnico;
    }

    public void setTecnico(int tecnico) {
        this.tecnico = tecnico;
    }

    public int getPsicologoco() {
        return psicologoco;
    }

    public void setPsicologoco(int psicologoco) {
        this.psicologoco = psicologoco;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }
   
    public String mostrarRendimiento(){
        return "Fecha de la última actualización: " + fecha + "Rendimiento total: " + rendimiento;
    }
}
