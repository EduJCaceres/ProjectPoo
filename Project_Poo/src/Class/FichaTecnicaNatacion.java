/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class FichaTecnicaNatacion extends FichaTecnica{
    private String estilo; // Estilo Preferido
    private int distancia; // Distancia Preferida
    
    public FichaTecnicaNatacion(){
        super();
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String fichaTecnica() {
        return super.fichaTecnica() + "Estilo preferido: " + estilo + "Distancia Preferido: " + distancia;
    }
}
