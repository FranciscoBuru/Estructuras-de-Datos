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
public class Operario extends Empleado{
    
    private int horasExtra;

    public Operario() {
    }

    public Operario(int horasExtra, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOperario" + "\nHoras extra: " + horasExtra;
    }
    
     
            
    public double calculaSalario(double pres, double ded, double precioHE){
        
        return super.calculaSalario(pres, ded) + precioHE*horasExtra;
            
            }
    
    
    
    
            
            
    
}
