/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public abstract class FichaTecnica {
    private int competenciasGanadas;
    
    public FichaTecnica(){
        
    }

    public int getCompetenciasGanadas() {
        return competenciasGanadas;
    }

    public void setCompetenciasGanadas(int competenciasGanadas) {
        this.competenciasGanadas = competenciasGanadas;
    }
    public String fichaTecnica(){
        return "Competencias Ganadas: " + competenciasGanadas;
    }
}
