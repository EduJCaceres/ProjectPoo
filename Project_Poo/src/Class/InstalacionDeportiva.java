/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.TipoCampo;

/**
 *
 * @author Edu
 */
public class InstalacionDeportiva {
    private String ubicacion;
    private TipoCampo tipoCampo; // Tipo de campo
    
    public InstalacionDeportiva() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoCampo getTipoCampo() {
        return tipoCampo;
    }

    public void setTipoCampo(TipoCampo tipo) {
        this.tipoCampo = tipo;
    }
    
    public String mostrarInstalacion(){
        return "Ubicación: " + ubicacion + "Tipo de Campo: " + tipoCampo;
    }
}
