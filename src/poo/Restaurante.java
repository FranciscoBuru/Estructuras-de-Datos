/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Francisco Aramburu
 */
public class Restaurante {
    
    private String nom;
    private int numMesas;
    private Cuadrado[] arreMesas;

    public Restaurante() {
        numMesas = 0;
        arreMesas = new Cuadrado[25];
    }

    public Restaurante(String nom) {
        this.nom = nom;
        numMesas = 0;
        arreMesas = new Cuadrado[25];
    }
    
    public void agregaMesa(int lado){
        if(numMesas<25){
            Cuadrado m=new Cuadrado(lado);
            arreMesas[numMesas]=m;
            numMesas++;
        }
    }
    
    public double calcManteles(){
        double suma=0;
        
        for(int i =0; i<numMesas; i++){
            
            suma=suma+arreMesas[i].calculaArea();
        
         }
        
        return suma;
    }
    
    public double calcMetros(){
        double suma=0;
        
        for(int i =0; i<numMesas; i++){
            
            suma=suma+arreMesas[i].calculaPerimetro();
        
         }
       
        return suma;
    }
    
    
    
    


}
