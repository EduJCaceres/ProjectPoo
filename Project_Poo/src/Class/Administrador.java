/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Administrador extends Persona{
    private String CODADMIN = "AdminForever"; //codigo unico de los Administradores
    private String admin;
    boolean v = false; // verificador de codigo de administradores
    public static ArrayList<Administrador> administrador = new ArrayList<>();
    
    public Administrador(String user, String password, String admin){
        super(user, password);
        this.admin = admin;
    }

    public String getCODADMIN() {
        return CODADMIN;
    }

    public void setCODADMIN(String CODADMIN) {
        this.CODADMIN = CODADMIN;
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
    
    public boolean verificar (String verificador){
        if(verificador.equals(CODADMIN)){v = true;}else{v = false;}
        return v;
    }
    
    public void agregarAdministrador(Administrador a){
        administrador.add(a);
    }
    
    @Override
    public String Persona() {
        return super.Persona() + "Codigo de administrador" + CODADMIN;
    }
}
