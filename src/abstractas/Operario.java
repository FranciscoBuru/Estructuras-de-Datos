/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

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
    //Sobreescribes el del padre abstracto
    public  double calculaSalario(double pres, double ded){
        return sueldoBase + pres*sueldoBase - ded*sueldoBase;
    }
    
     
    //sobregacrgas el otro... va a agarrar dependiendo lo que le des
    public double calculaSalario(double pres, double ded, double precioHE){
        
        return  calculaSalario( pres,  ded) + precioHE*horasExtra;
            
            }
    
}
