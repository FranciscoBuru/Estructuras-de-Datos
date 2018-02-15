/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import Pilas.PilaA;


/**
 *
 * @author Francsico Aramburu
 */
public class Parentesis {
    
   
    public static boolean  revisorParentesis(String leer){
        
        PilaA <Character> revisor = new PilaA();
        
        int n =0;
        
        while(n<leer.length()){
            if(leer.charAt(n)=='('){
                revisor.push('(');
            
            }
            else if(leer.charAt(n)==')'&& !revisor.isEmpty()){
                
                revisor.pop();
            
            }
            else if(leer.charAt(n)==')'&& revisor.isEmpty()){
                
                return false;
            
            }
            
            n++;
        
        }
        return (revisor.isEmpty());
        
        
    
    }
    
    public static void main(String[] args) {
        
        System.out.println(revisorParentesis("(5+6)"));
        
    }
    
    
    
}
