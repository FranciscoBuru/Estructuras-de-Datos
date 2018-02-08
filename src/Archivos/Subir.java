/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileOutputStream;
import java.io.*;



/**
 *
 * @author Francisco Aramburu
 */
public class Subir  {
    
    
    public static void main(String[] args) {
        
        
        Perro p1 = new Perro("raza","color","nombre");
        Perro p2 = new Perro("labrador","cafe","timona");
        Perro p3 = new Perro("huskey","blanco","taco");
        Perro p4 = new Perro("golden","amarillo","pasita");
        
        try(FileOutputStream file = new FileOutputStream("Perro."); 
                ObjectOutputStream escribe = new ObjectOutputStream(file);){
            
            escribe.writeObject(p4);
            escribe.writeObject(p3);
            escribe.writeObject(p2);
            escribe.writeObject(p1);
            
            
            
            
        
        }catch(Exception e){
        
            System.out.println("NO");
            
        }
    }
    
}
