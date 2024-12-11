
package SoftwareAcademia;

import Class.Administrador;
import Class.Alumno;
import Class.Entrenador;
import Desing.Inicio;
import java.util.ArrayList;
import java.util.List;

public class SGAD {
    public static List<Alumno> alumnos;
    public static List<Entrenador> entrenador;
    public static List<Administrador> administrador;
      
    public static void main(String[] args) {
        
        alumnos = new ArrayList<>();
        entrenador = new ArrayList<>();
        administrador = new ArrayList<>();
        
        Inicio x = new Inicio();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        
        
    }    
}
