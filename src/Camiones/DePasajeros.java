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
public class DePasajeros extends Camion {
    
    private int totalPasaj;

    public DePasajeros() {
    }

    public DePasajeros(int totalPasaj, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.totalPasaj = totalPasaj;
    }
    
    @Override
    public String toString(){
    
        StringBuilder res= new StringBuilder();
        res.append(super.toString());
        res.append("Con capacidad para ");
        res.append(totalPasaj);
        res.append(" pasajeros");
        res.append("\n");
        return res.toString();
    
    }
    
    @Override
    public String getMarca(){
    
        return super.getMarca();
    }
    
    
    
}
