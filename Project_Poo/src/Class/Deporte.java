/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class Deporte {
   private String nombre;
   private int cantAlumnos = 0; // Cantidad de alumnos
   
   public Deporte(String name){
       this.nombre = name;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }
   
    public String mostrarDeporte(){
        return "Nombre del Deporte: " + nombre + "Cantidad de alumnos inscritos: " + cantAlumnos;
    }
}
