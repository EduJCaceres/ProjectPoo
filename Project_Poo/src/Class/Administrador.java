/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Edu
 */

public class Administrador extends Persona implements Comparable<Administrador>{
    private String CODADMIN = "ForeverAdmin"; //codigo unico de los Administradores
    
    public Administrador(){
        super();
    }

    public String getCODADMIN() {
        return CODADMIN;
    }

    public void setCODADMIN(String CODADMIN) {
        this.CODADMIN = CODADMIN;
    }
    
    @Override
        public int compareTo(Administrador aux) {
            return super.getApellido().compareTo(aux.getApellido());
        }
        
    @Override
        public String Persona() {
            return super.Persona() + "Codigo de administrador" + CODADMIN;
        }  
}
