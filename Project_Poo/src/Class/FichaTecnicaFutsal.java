/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class FichaTecnicaFutsal extends FichaTecnica{
    private String posicion;
    private int dorsal;
    private String pieDominante;
    
    public FichaTecnicaFutsal(){
        super();
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    @Override
    public String fichaTecnica() {
        return super.fichaTecnica() + "Posicion: " + posicion + "Dorsal: " + dorsal + "Pie Dominante: " + pieDominante;
    }
}
