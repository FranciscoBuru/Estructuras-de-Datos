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
    
    
    
    public static void main(String[] args) {
        PilaA p1 = new PilaA();
        PilaA p2 = new PilaA();
        
        p1.push(1);
        p1.push(3);
        p1.push(2);
        p1.push(2);
        
        p2.push(1);
        p2.push(3);
        p2.push(2);
        p2.push(4);
        
       
        
        System.out.println(equals( p1, p2));
        
        
    }
    
}
