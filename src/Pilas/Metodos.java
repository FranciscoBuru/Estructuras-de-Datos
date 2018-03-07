/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author edi
 */
public class Metodos {
    
    
    public static <T> boolean equals(PilaADT <T> p1,PilaADT<T> p2){
        
        boolean aux = true;
        
        if(!p1.isEmpty() && !p2.isEmpty()){
            
            while(aux && !p1.isEmpty() && !p2.isEmpty()){
                
                if(!p1.pop().equals(p2.pop())){
                    aux = false;
                }
            }
            
            
        }
        else{
            aux = false;
        }
        
        
        return aux;
    }
    
    
    public static <T> int tamanio(PilaADT <T> p1){
        
        int aux = 0;
        
         PilaA <T> p2 = new PilaA();
        
        if(!p1.isEmpty()){
            
            while(!p1.isEmpty()){
                p2.push(p1.pop());
                aux++;
                
            }
            
            while(!p2.isEmpty()){
                p1.push(p2.pop());
                
                
            }
            
            
        }
        
        
        
        return aux;
    }
    
    //Pilas desordenadas
    
    public static <T> boolean contiene(PilaADT <T> p1,PilaADT<T> p2){
        
        boolean aux = true;
        PilaA <T> aux1 = new PilaA();
        PilaA <T> aux2 = new PilaA();
        
        if(!p1.isEmpty() && !p2.isEmpty()){
            
            while(!p2.isEmpty()){
                
                
                while(aux && !p1.isEmpty()){
                    aux1.push(p1.peek());
                    if(p2.peek().equals(p1.pop())){
                        aux = false;
                    }
                }
                if(aux){
                    return false;
                }
                else{
                    aux = true;
                    aux2.push(p2.pop());
                    while(!p1.isEmpty()){
                        aux1.push(p1.pop());
                    }
                    while(!aux1.isEmpty()){
                        p1.push(aux1.pop());
                    }
                
                }
            
            }
            
            while(!aux2.isEmpty()){
                p2.push(aux2.pop());
            }
            
               
        }
        else
            return false;
        
        
        
        return true;
    }
    
    public static <T> boolean voltea(PilaADT <T> p1){
        
        boolean aux = true;
        PilaA <T> aux1 = new PilaA();
        PilaA <T> aux2 = new PilaA();
        
        while(!p1.isEmpty()){
            aux1.push(p1.pop());
        }
        while(!aux1.isEmpty()){
            aux2.push(aux1.pop());
        }
        
        while(!aux2.isEmpty()){
            p1.push(aux2.pop());
        }
         
        
        
        
        return aux;
    }
    
    public static <T> PilaA <T> eliminaRepetidosOrdenados(PilaADT <T> p1){
        
        boolean aux = true;
        PilaA <T> aux1 = new PilaA();
        PilaA <T> aux2 = new PilaA();
        
        aux1.push(p1.pop());
        
        while(!p1.isEmpty()){
        
            while(aux1.peek().equals(p1.peek())){
            
                p1.pop();
            }
            if(!p1.isEmpty()){
                aux1.push(p1.pop());
            }
        }
        
         
        
        
        
        return aux1;
    }
    
    
    
 
    
    
    
    
    public static void main(String[] args) {
        PilaA p1 = new PilaA();
        PilaA p2 = new PilaA();
        PilaA p3;
        p3 = new PilaA();
        
        p1.push(1);
        p1.push(3);
        p1.push(3);
        p1.push(3);
        p1.push(8);
        p1.push(7);
        p1.push(7);
        p1.push(7);
        
        
        p2.push(8);
        p2.push(1);
        p2.push(2);
        p2.push(1);
        
        p3.push(1);
        p3.pop();
       
       
        p3 = eliminaRepetidosOrdenados(p1);
       
        while(!p3.isEmpty()){
            System.out.println(p3.pop());
        }
        
        
    }
    
}
