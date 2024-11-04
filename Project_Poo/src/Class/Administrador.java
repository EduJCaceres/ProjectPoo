/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import SoftwareAcademia.SGAD;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Edu
 */

public class Administrador extends Persona{
    private String CODADMIN = "AdminForever"; //codigo unico de los Administradores
    private String admin;
    boolean v = false; // verificador de codigo de administradores
    
    public Administrador(String user,String password, String cod){
        super(user,password);
        this.admin = cod;
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
    
    private boolean verificar (String verificador){
        if(verificador.equals(CODADMIN)){v = true;}else{v = false;}
        return v;
    }
    
    private void agregarAdministrador(){
        SGAD.administrador.add(new Administrador(getUsuario(),getContraseña(),getAdmin()));
    }
    
    /*public void validacion(){
    boolean cUser=true;
    boolean cPass=true;
    boolean x = true;
    
        Pattern patronUsuario = Pattern.compile("\\w[@admin.com]$");
        Pattern patronContraseña = Pattern.compile("\\w\\d+{8,}");
        
        Matcher user = patronUsuario.matcher(super.getUsuario());
        Matcher pass = patronContraseña.matcher(super.getContraseña());
        
        cUser = user.find();
        cPass = pass.find();
        
        
        if(cUser == true && cPass == true && v == true) {
            agregarAdministrador();
        }else if(cUser == false || cPass == false || v == false){
            System.out.println("error");
        }
        
        
    }*/
    
    @Override
    public String Persona() {
        return super.Persona() + "Codigo de administrador" + CODADMIN;
    }
}
