/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

/**
 *
 * @author edi
 */
public interface ConjuntoADT <T> {
    
    public boolean contiene(T dato);
    public boolean estaVacio();
    public boolean agrega(T dato);
    public T quita(T dato);
    public ConjuntoADT <T> union(ConjuntoADT <T> otro); 
    public ConjuntoADT <T> interseccion(ConjuntoADT <T> otro); 
    public IteradorArreglo <T> iterator();
    public int getCardinalidad();
    
    
    
}
