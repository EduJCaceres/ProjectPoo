/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class Sede {
    private String codSede;
    private String departamento;
    private String provincia;
    private String distrito;
    private String ubicacion;
    private Boolean promo;
    private double descPromo;
    private Pago pago;
    
    public Sede(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String getCodSede() {
        return codSede;
    }
    
    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public boolean getPromo() {
        return promo;
    }
    
    public void setPromo(boolean promo) {
        this.promo = promo;
    }
    
    public double getDescPromo() {
        return descPromo;
    }
    
    public void setDescPromo(double desc) {
        this.descPromo = desc/100;
    }
    
    //Metodo para calcular los pagos de las matriculas
    public double pagoMatricula(double unico) {
        pago.setPagoUnico(unico);
        
        if(promo == true){
            return pago.getPagoUnico() - (pago.getPagoUnico()*descPromo);
        }else{
            return pago.getPagoUnico();
        }
    }
    
    public void pagoMensual(double mensual) {
        pago.setPagoMensual(mensual);
    }
    
    public String mostrarSede(){
        return "Departamento: " + departamento + "Provincia: " + provincia + "Distrito: " + distrito + "Ubicación: " + ubicacion;
    }
}
