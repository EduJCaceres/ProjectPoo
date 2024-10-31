/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class FichaTecnicaBoxeo extends FichaTecnica{
    private String catPeso; // Categoria de Peso
    private String mano; // Mano Dominante
    private String estilo; // Estilo de boxeo preferido
    
    public FichaTecnicaBoxeo(){
        super();
    }

    @Override
    public String fichaTecnica() {
        return super.fichaTecnica() + "Categoria de Peso: " + catPeso + "Mano Dominante: " + mano + "Estilo de Boxeo Preferido: " + estilo;
    }
}
