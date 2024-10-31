/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public class Administrador extends Persona{
    private String codAdmin; //codigo unico de los Administradores
    
    public Administrador(String user, String password, String admin){
        super(user, password);
        this.codAdmin = admin;
    }
    
    public String getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
    }

    @Override
    public String Persona() {
        return super.Persona() + "Codigo de administrador" + codAdmin;
    }
}
