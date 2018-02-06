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
public class DeVolteo extends Camion {
    
    private double capTon;

    public DeVolteo() {
    }

    public DeVolteo(double capTon, String marca, String nimMotor, String placas) {
        super(marca, nimMotor, placas);
        this.capTon = capTon;
    }

    @Override
    public String toString() {
        
        StringBuilder res= new StringBuilder();
        res.append(super.toString());
        res.append("Con capacidad para ");
        res.append(capTon);
        res.append(" pasajeros");
        res.append("\n");
        
        return res.toString();
   
    
    
    }
    @Override
    public String getPlacas(){
    
        return super.getPlacas();
    }

    public void setCapTon(double capTon) {
        this.capTon = capTon;
    }

    public double getCapTon() {
        return capTon;
    }
    
    
    
    
    
    

   
    
    
    
}
