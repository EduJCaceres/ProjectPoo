/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class FichaTecnicaBaloncesto extends FichaTecnica{
    private String posicion;
    private int dorsal;
    
    public FichaTecnicaBaloncesto(){
        super();
    }

    @Override
    public String fichaTecnica() {
        return super.fichaTecnica() + "Posicion: " + posicion + "Dorsal: " + dorsal;
    }
}
