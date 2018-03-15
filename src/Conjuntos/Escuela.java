/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author edi
 */
public class Escuela {
    
    String nombre;
    String direccion;
    
    ConjuntoA <Alumno> alumIng = new ConjuntoA();
    ConjuntoA <Alumno> alumLic = new ConjuntoA();
    
    
    public void agregaAl(Alumno nuevo, String conj){
        
        if(conj.equals("Ing")){
            
            alumIng.agrega(nuevo);
            
        }
        else
            alumLic.agrega(nuevo);
        
        
    }
    
    public void auitaAl(int clave){
        
        Alumno a1 = new Alumno(clave);
        
        if(alumIng.contiene(a1))
            alumIng.quita(a1);
           
        if (alumLic.contiene(a1))
            alumLic.quita(a1);
        
        
    }
    
    
    

}
