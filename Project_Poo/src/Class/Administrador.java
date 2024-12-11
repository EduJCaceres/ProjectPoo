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
    private String admin;
    boolean v = false; // verificador de codigo de administradores
    
    public Administrador(String cod){
        super();
        this.admin = cod;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public boolean getV() {
        return v;
    }

    public void setV(boolean v) {
        this.v = v;
    }
    
     private String comparar(String comparador) {
        if (comparador.equals(CODADMIN)) {
            setAdmin(CODADMIN);
        }else{
            setAdmin(null);
        }
       return admin; 
    }
    
    private boolean verificar (String verificador){
        comparar(verificador);
        if(CODADMIN.equals(admin)){v = true;}else{v = false;}
        return v;
    }
    
    /*public void agregarAdministrador(String codigo){
        verificar(admin);
        if(v == true){
            SGAD.administrador.add(new Administrador(codigo));
        }else if(v == false){
        }
    }*/
    @Override
        public int compareTo(Administrador aux) {
            return super.getApellido().compareTo(aux.getApellido());
        }
        
    @Override
        public String Persona() {
            return super.Persona() + "Codigo de administrador" + CODADMIN;
        }  
}
