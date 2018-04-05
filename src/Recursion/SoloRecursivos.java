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
public class SoloRecursivos {
 
    
    public static void torresHanoi(int n, String ori, String des, String aux){
        
        if(n==1){
            System.out.println("Mueve el disco de " + ori + " a " + des);
        }
        else{
            torresHanoi(n-1,ori,aux,des);
            System.out.println("Mueve el disco de " + ori + " a " + des);
            torresHanoi(n-1,aux,des,ori);
        }
    
    
    
    }
    
    public static void main(String[] args) {
        torresHanoi(6, "1", "3", "2");
    }
    
}