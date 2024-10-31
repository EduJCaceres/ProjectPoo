/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Edu
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String tipoDi; //Tipo de Documento de Identidad
    private int numDi; //Numero de Documento de Identidad
    private String email;
    private int telefono;
    private String sede;
    private String usuario;
    private String contraseña;
    
    public Persona(String user, String password){
        this.usuario = user;
        this.contraseña = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDi() {
        return tipoDi;
    }

    public void setTipoDi(String tipoDi) {
        this.tipoDi = tipoDi;
    }

    public int getNumDi() {
        return numDi;
    }

    public void setNumDi(int numDi) {
        this.numDi = numDi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String Persona() {
        return  "Usuario: " + usuario + "Contraseña: " + contraseña;
    }
}
