/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class FichaTecnicaTenis extends FichaTecnica{
    private String mano; // Mano dominante
    private String superf; // Superficie preferidad
    private String estilo; // estilo preferido
    
    public FichaTecnicaTenis(){
        super();
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public String getSuperf() {
        return superf;
    }

    public void setSuperf(String superf) {
        this.superf = superf;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String fichaTecnica() {
        return super.fichaTecnica() + "Mano Dominante: " + mano + "Superficie Preferida: " + superf + "Estilo Preferido: " + estilo;
    }
}
