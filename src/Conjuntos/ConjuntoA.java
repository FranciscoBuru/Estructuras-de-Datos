/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import java.util.Iterator;

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

    private ConjuntoA(int i) {
        
        conjunto = (T[]) new Object [i];
        cardinalidad = 0;
    }
    
    
    @Override
    public boolean estaVacio(){
        return cardinalidad == 0;
    }
    
    @Override
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
    public Iterator <T> iterator(){
        
        return new IteradorArreglo(conjunto , cardinalidad);
    
    }
    
    @Override
    public boolean contiene(T dato){
        boolean res = false;
        Iterator <T> it = this.iterator();
        while(it.hasNext() && !res){
            res = it.next().equals(dato);
        }
        return res;
        
    }
    
    @Override
    public boolean agrega(T dato){
        
        boolean res;
        res = contiene(dato);
        if(!res){
            
            if(cardinalidad >= conjunto.length)
               // expandCapacity();
        
            cardinalidad++;
            conjunto[cardinalidad] = dato;
        }
        return res;
    
    }
    
    @Override
    public ConjuntoADT <T> union(ConjuntoADT <T> otro){
        
        ConjuntoADT <T> nuevo;
        nuevo = new ConjuntoA  (otro.getCardinalidad() + cardinalidad);
        
        for(int i = 0; i<cardinalidad; i++){
            nuevo.agrega(conjunto[i]);
        }
        Iterator<T> it = otro.iterator();
        for(int i = 0; i < otro.getCardinalidad(); i++){
            nuevo.agrega(it.next());
        }
        
        return nuevo;
    }
    
    @Override
    public ConjuntoADT <T> interseccion(ConjuntoADT <T> otro){
        
        ConjuntoADT <T> nuevo;
        nuevo = new ConjuntoA  (otro.getCardinalidad() + cardinalidad);
        
        for(int i = 0; i<cardinalidad; i++){
            if(otro.contiene(conjunto[i])){
                nuevo.agrega(conjunto[i]);
            }
        }
        
        return nuevo;
    }
    
    @Override
    public int getCardinalidad(){
        
        return cardinalidad;
        
    }
    
     public ConjuntoADT <T> resta(ConjuntoADT <T> otro){
        
        ConjuntoADT <T> nuevo;
        nuevo = new ConjuntoA  (otro.getCardinalidad() + cardinalidad);
        
        for(int i = 0; i<cardinalidad; i++){
            if(!otro.contiene(conjunto[i])){
                nuevo.agrega(conjunto[i]);
            }
        }
        
        return nuevo;
    }
     
     public static <T> void impConj(ConjuntoADT <T> otro){
         
         Iterator <T> it = otro.iterator();
         while(it.hasNext())
             System.out.println(it.next() + " ");
     
     
     }
    
    

    
    
}
