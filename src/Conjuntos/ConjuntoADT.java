/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import java.util.Iterator;

/**
 *
 * @author Francisco Aramburu
 */
public interface ConjuntoADT <T> extends Iterable {
    
    public boolean contiene(T dato);
    public boolean estaVacio();
    public boolean agrega(T dato);
    public T quita(T dato);
    public ConjuntoADT <T> union(ConjuntoADT <T> otro); 
    public ConjuntoADT <T> interseccion(ConjuntoADT <T> otro); 
    @Override
    public Iterator <T> iterator();
    public int getCardinalidad();
    
    
    
}
