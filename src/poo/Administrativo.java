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
public class Administrativo extends Empleado {
    
    private String departamento, telefono;
	

	public Administrativo() {
		
	}


	

    public Administrativo(String departamento, String telefono, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }
        
        


	@Override
	public String toString() {
		return super.toString() + "\nAdministrativo \nDepartamento: " + departamento + "\nTeléfono: " + telefono;
	
        }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
        
        
}
