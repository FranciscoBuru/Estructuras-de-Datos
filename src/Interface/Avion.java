/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Francisco Aramburu
 */
public class Avion implements ObjVolador {
    
    String tipo;
    int pasajeros;
    int clave;

    public Avion() {
    }

    public Avion(String tipo, int pasajeros, int clave) {
        this.tipo = tipo;
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getClave() {
        return clave;
    }
    
    
    
    @Override
    public void despega(){
    }
    
    @Override
    public void aterriza(){
    }
    
    @Override
    public void seDesplaza(){
    }
    
    public static String clavAv(Avion arre[], int n, int cla){
    
        String res ="hola";
       int i=0;
        boolean aux = true;
        
        while(i<n && aux){
            if(arre[i].getClave()==cla){
               res= "Son " + arre[i].getPasajeros()+  " pasajeros";
               aux = false;
             
            }
          i++;
        
      
    }
    return res;
    }
    
}
