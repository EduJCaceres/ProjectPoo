/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;


import java.util.List;
import java.util.function.Predicate;



/**
 *
 * @author Edu
 */
public interface GestionColecciones<T> {
    void agregar(T elements);
    void eliminar(T elements);
    void modificar(int s, T elements);
    List<T> filtrar(Predicate<T> criterio);
}
