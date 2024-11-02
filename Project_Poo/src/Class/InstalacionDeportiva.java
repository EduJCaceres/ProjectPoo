/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class InstalacionDeportiva {
    private String ubicacion;
    private String tipo; // Tipo de campo
    
    public InstalacionDeportiva() {
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String mostrarInstalacion(){
        return "Ubicación: " + ubicacion + "Tipo de Campo: " + tipo;
    }
}
