/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import SoftwareAcademia.SGAD;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Alumno extends Persona{
    private String fecNac; //Fecha de Nacimiento
    private boolean competencia;
    private String pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
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
    
    public void agregarAlumno(){
        SGAD.alumno.add(new Alumno());
    }

    @Override
    public String Persona() {
        return super.Persona() + "Competencia: " + competencia;
    }
    
}
