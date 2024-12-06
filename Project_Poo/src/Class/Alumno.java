/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import ClassMethods.GestionColeccion;
import Enumeradores.Deporte;
import Enumeradores.Paises;
import java.util.ArrayList;

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
    private Rendimiento rendimiento;
    private boolean beca;
    private double descBeca;
    private Pago pago;
    public static ArrayList<Alumno> alumno = new ArrayList<>();
    private String ficha;
    private FichaTecnicaFutbol ftf;
    private FichaTecnicaFutsal ftfs;
    private FichaTecnicaBaloncesto ftb;
    private FichaTencicaVoley ftv;
    private FichaTecnicaBoxeo ftbo;
    private FichaTecnicaNatacion ftn;
    private FichaTecnicaTenis ftt;
    private Deporte deporte;
    
    public Alumno() {
        super();
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public boolean getCompetencia() {
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
    
    public boolean getBeca() {
        return beca;
    }
    
    public void setBeca(boolean beca) {
       if(beca == true) {
            this.beca = beca;
        }else if(beca == false){
            this.beca = beca;
        }
    }
    
    public void setDescBeca(double descBeca) {
        this.descBeca = descBeca/100;
    }
    
    public double getDescBeca() {
        return descBeca;
    }
    
    public Deporte getDeporte() {
        return deporte;
    }
    
    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }
        
    public double pagoMensual() {
        if(beca == true) {
            return pago.getPagoMensual()-(pago.getPagoMensual()*descBeca);
        }else{
            return pago.getPagoMensual();
        }
    }
    
    public void setRendimiento(Rendimiento rendimiento) {
        this.rendimiento = rendimiento;
    }
    
    public Rendimiento getRendimiento(){
        return rendimiento;
    }
    
    public void calcularRendimiento(int f, int te, int ta, int p) {
        rendimiento.setFisico(f);
        rendimiento.setTecnico(te);
        rendimiento.setTactico(ta);
        rendimiento.setPsicologoco(p);
        
        double r = (f + te + ta + p)/4;
        
        rendimiento.setRendimiento(r);
    }
    
    //metodo para mostrar los datos de la ficha a la cual le pertenece al alumno
    public String mostrarFicha(String depor){
        if(depor.equalsIgnoreCase("Futbol")){
            return ficha = ftf.toString();
        }else if(depor.equalsIgnoreCase("FutbolSala")){
            return ficha = ftfs.toString();
        }else if(depor.equalsIgnoreCase("Baloncesto")){
            return ficha = ftb.toString();
        }else if(depor.equalsIgnoreCase("Voley")){
            return ficha = ftv.toString();
        }else if(depor.equalsIgnoreCase("Boxeo")){
            return  ficha = ftbo.toString();
        }else if(depor.equalsIgnoreCase("Natacion")){
            return ficha = ftn.toString();
        }else if(depor.equalsIgnoreCase("Tenis")){
            return  ficha = ftt.toString();
        }
        return null;
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
