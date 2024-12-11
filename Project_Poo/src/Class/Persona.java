/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.Generos;
import Enumeradores.TipoDocumento;

/**
 *
 * @author Edu
 */

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String tipoDocumento; //Tipo de Documento de Identidad
    private String numDi; //Numero de Documento de Identidad
    private String genero;
    private int telefono;
    private String sede;
    private String usuario;
    private String contraseña;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String tipoDocumento, String numDi, String genero, int telefono, String sede, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numDi = numDi;
        this.genero = genero;
        this.telefono = telefono;
        this.sede = sede;
        this.usuario = usuario;
        this.contraseña = contraseña;
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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDi() {
        return numDi;
    }

    public void setNumDi(String numDi) {
        this.numDi = numDi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
