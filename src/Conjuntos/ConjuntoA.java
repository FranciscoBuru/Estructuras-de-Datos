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
public class ConjuntoA <T> implements ConjuntoADT <T> {
    
    private T[] conjunto;
    private int cardinalidad;
    private final int MAXIMO = 50;

    public ConjuntoA() {
        
        conjunto = (T[]) new Object [MAXIMO];
        cardinalidad = 0;
        
    }
    
    
    public boolean estaVacio(){
        return cardinalidad == 0;
    }
    
    public T quita(T dato){
        
        T resul;
        int i;
        resul = null;
        i = 0;
        
        while(i < cardinalidad && !dato.equals(conjunto[i])){
            i++;
        
        
            if(i < cardinalidad && dato.equals(conjunto[i])){
                resul = conjunto[i];
                conjunto[i] = conjunto[cardinalidad - 1];
                cardinalidad--;
            }    
        }
        return resul;
    
    }
    
    @Override
    public IteradorArreglo <T> iterator(){
        
        return new IteradorArreglo(conjunto , cardinalidad);
    
    }
    
    @Override
    public boolean contiene(T dato){
        boolean res = false;
        IteradorArreglo <T> it = this.iterator();
        while(it.hasNext() && !res){
            res = it.next().equals(dato);
        }
        return res;
        
    }
    
    
}
