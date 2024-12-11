/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassMethods;

import Class.Persona;
import Interface.GestionColecciones;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class GestionColeccion<T extends Persona> implements GestionColecciones<T>, Iterable<T>{
    private List<T> personas = new ArrayList<>();
    
    @Override
    public void agregar(T persona){
        personas.add(persona);
    }
    
    @Override
    public void eliminar(int index){
        personas.remove(index);
    }
    
     @Override
    public void modificar(int s, T elements){
       personas.set(s, elements);
    }
    
    @Override
    public List<T> filtrar(Predicate<T> criterio){
        return personas.stream().filter(criterio).collect(Collectors.toList());
    }
    
    @Override
    public Iterator<T> iterator(){
        return personas.iterator();
    }
    
    public T ultimaPosicion(){
        if(personas.isEmpty()){
            return null;
        }
        return personas.get(personas.size()-1);
    }
    
    public T primeraPosicion(){
        if(personas.isEmpty()){
            return null;
        }
        return personas.get(0);
    }
    
   private int buscarIndice(List<T> list, String datoBuscado){
       for(int i=0; i<list.size(); i++){
           if(list.get(i).getNombre().equalsIgnoreCase(datoBuscado)){
               return i;
           }
       }
        return -1;
    }
   
   public T buscar(String dato) {
       int indice = buscarIndice(personas,dato);
       
       if(indice!=-1){
           return personas.get(indice);
       }else{
           JOptionPane.showMessageDialog(null, "Datos no encontrados", "ERROR", JOptionPane.ERROR_MESSAGE);
           return null;
       }
   }
}
