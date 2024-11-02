/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author Edu
 */
public class Categoria {
    private int categoria;
    
    /*public int convertir(Date fecha){
        categoria = fecha - fechaactual;
        return categoria;
    }*/

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public String mostarcategoria(){
        return "categoria: " + categoria;
    }
}
