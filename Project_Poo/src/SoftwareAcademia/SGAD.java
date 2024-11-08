
package SoftwareAcademia;

import Class.Administrador;
import Class.Alumno;
import Class.Entrenador;
import Desing.Inicio;
import java.util.ArrayList;

public class SGAD {
      public static ArrayList<Administrador> administrador;
      public static ArrayList<Alumno> alumno;
      public static ArrayList<Entrenador> entrenador;
      
      
    public static void main(String[] args) {
        administrador = new ArrayList<>();
        alumno = new ArrayList<>();
        entrenador = new ArrayList<>();
        
        Inicio x = new Inicio();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        
        /*Alumno f = new Alumno();
        f.setUsuario("edu@academ.com");
        f.setContraseña("edu13224kd-.");
        System.out.println(f.getUsuario());
        System.out.println(f.getContraseña());
        for (Alumno a : alumno) {
            System.out.println(a);
        */
    }    
}
