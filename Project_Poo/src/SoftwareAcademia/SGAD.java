
package SoftwareAcademia;

import Class.Administrador;

public class SGAD {
      
    public static void main(String[] args) {
        Administrador x = new Administrador("a","a","AdminForever");
        x.verificar(x.getAdmin());
        System.out.println(x.getV());
    }
}
