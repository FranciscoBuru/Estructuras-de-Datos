/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;



/**
 *
 * @author Francsico Aramburu
 */
public class PilaA <T> implements PilaADT <T> {
    
    private T[] colec;
    private int tope;
    private final int MAX =20;
    
    public PilaA(){
    
        colec = (T[]) new Object [MAX];
        tope = -1;
    
    }
    
   
    public PilaA(int max){
    
        colec = (T[]) new Object [max];
        tope = -1;
    
    }
    @Override
    public boolean isEmpty(){
        return tope==-1;
    
    }
    @Override
    public void push(T dato){
    
        if(tope==colec.length){
            expandCapacity();
        }
    tope++;
    colec[tope] = dato;
    
    }

    private void expandCapacity(){
        T[] nuevo = (T[]) new Object[colec.length*2];
        for(int i =0; i<colec.length; i++){
            nuevo [i]= colec [i];
        }
        colec = nuevo;
    }
    @Override
    public T pop(){
        T resultado;
        if(isEmpty())
            resultado=null;
        
        else{
            resultado = colec[tope];
            colec[tope]=null;
            tope--;
        
        }
        return resultado;
        
        
        /*
        if(isEmpty())
            trow new ExceptionColecVacia("Pila Vacia");
        */
        
        
    }
    
    @Override
    public T peek(){
        T resultado;
        resultado = null;
        if(!isEmpty())
            resultado = colec[tope];
               
        return resultado;
        
        
        
    /*
        if(isEmpty())
            return colec [tope];
        else
            trow new ExceptionColecVacia("Pila Vacía")
        
        
        
    */
    }
    
    
    public boolean equals(PilaADT <T> p1){
        
        boolean aux = true;
        
         if(!p1.isEmpty() && !isEmpty()){
            
            while(aux){
                
                if(!p1.pop().equals(pop())){
                    aux = false;
                }
            }
            
            
        }
        else{
            aux = false;
        }
        
        
        return aux;
    }
    
}
