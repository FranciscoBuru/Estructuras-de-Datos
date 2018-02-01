/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author edi
 */
public class Pajaro implements ObjVolador {
    
    int clave;
    String especie;
    String color;

    public Pajaro() {
    }

    public Pajaro(int clave, String especie, String color) {
        this.clave = clave;
        this.especie = especie;
        this.color = color;
    }

    public int getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "clave=" + clave + ", especie=" + especie + ", color=" + color + '}';
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
    
    public static String infoPaj(Pajaro arre[] , int num, int n){
        
        String res = null;
        int i =0;
        boolean aux = true;
        
        while(i<n && aux){
            if(arre[i].getClave()==num){
               res= arre[i].toString();
               aux = false;
            }
            i++;
        
        
      
    }
    return res;
    }
}