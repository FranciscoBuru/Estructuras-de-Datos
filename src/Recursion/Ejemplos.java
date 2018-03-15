/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author edi
 */
public class Ejemplos {
    
    
    /**
     * 
     * Método recursivo que regresa el factorial de un número.
     * Es ineficiente pero sirve como ejemplo para entender concepto de 
     * recursión.
     * @param n es el número del que se busca el factorial
     * @return el número ya factorial 
     */
    
    public static int calcFact(int n){
        
        if(n>=-1){
            
            if(n==0 || n==1){
                return 1;
            }
            else
                return n*calcFact(n-1);
        
        }
        return -1;
    }
    
    
    public static int sumaArreEnteros(int arre[] , int n){
        
        if(n==0)
            return 0;
        
        else
            return arre[n-1]+sumaArreEnteros(arre , n-1);
        
        
        
    }
    
     public static void imprimeArre1(int arre[] , int n){
        
        if(n==0)
             System.out.println("");
        
        else{
            imprimeArre1( arre ,  n-1);
            System.out.println(arre[n-1]);
            
        }   
        
        
        
    }
     
     public static void imprimeArre2(int arre[] , int n){
        
        if(n==0)
             System.out.println("");
        
        else{
            
            System.out.println(arre[n-1]);
            imprimeArre2( arre ,  n-1);
            
        }   
        
        
        
    }
    
   
    
    
    
    
    public static void main(String[] args) {
        
        int arre[] = new int [20];
        
        arre[0]=1;
        arre[1]=2;
        arre[2]=3;
        arre[3]=4;
        arre[4]=5;
        
        //System.out.println(sumaArreEnteros(arre,5));
        
        imprimeArre2(arre , 5);
        imprimeArre1(arre , 5);
        
        
        
        
        
    }
    
    
}
