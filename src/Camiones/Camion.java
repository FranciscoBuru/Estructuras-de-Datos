/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camiones;

/**
 *
 * @author Francisco Aramburu
 */
public abstract class Camion {
    
    private String marca, numMotor, placas;

    public Camion() {
    }

    public Camion(String marca, String nimMotor, String placas) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }
    
    @Override
    public String toString(){
    
        StringBuilder res = new StringBuilder();
        res.append("La marca del camión es: ").append(marca).append("\n");
        res.append("Las placas del camión son: ").append(placas).append("\n");
        res.append("El número de motor del camión es: ").append(numMotor).append("\n");
        return res.toString();
    
    }

    public String getPlacas() {
        return placas;
    }
    
    

    public String getMarca() {
        return marca;
    }
    

    
    
    
    
    
    
    
}
