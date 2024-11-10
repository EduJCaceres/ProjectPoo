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
    public void eliminar(T persona){
        personas.remove(persona);
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
}
