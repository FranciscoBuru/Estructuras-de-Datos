/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto1;

import Pilas.PilaA;

/**
 *
 * @author edi
 */
public class VolteaStr {
    
    
    
   public static String voltea(String palab){
        
       String res = "";
       PilaA <Character> pila = new PilaA();
       int n = 0;
       
       while(n<palab.length()){
           
           pila.push(palab.charAt(n));
           n++;
       }
       
       while(n>0){
           
           res= res + pila.pop();
           n--;
       
       }
   
   return res;
       
   }
   
    public static void main(String[] args) {
        
        System.out.println(voltea(""));
        
    }
    
    
    
}
