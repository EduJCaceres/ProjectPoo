
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
        
       /* Administrador x = new Administrador("ForeverAdmin");
        x.agregarAdministrador();
        
        System.out.println(x.getAdmin());*/
       
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
    }    
}
