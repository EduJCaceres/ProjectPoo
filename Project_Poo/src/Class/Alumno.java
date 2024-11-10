/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.Paises;

/**
 *
 * @author Edu
 */
public class Alumno extends Persona implements Comparable<Alumno>{
    private String fecNac; //Fecha de Nacimiento
    private boolean competencia;
    private Paises pais;
    private double altura;
    private double peso;
    private int rendimiento;

    public Alumno() {
        super();
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public boolean isCompetencia() {
        return competencia;
    }

    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }
    
    @Override
        public int compareTo(Alumno aux) {
            return super.getApellido().compareTo(aux.getApellido());
        }
    
    @Override
        public String Persona() {
            return super.Persona() + "Competencia: " + competencia;
        }
}  
