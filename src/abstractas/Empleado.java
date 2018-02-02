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

//No ahorra códico, solo ayuda a organizar
//Cuando dos hijos comparten metodo es mejor 
public abstract class Empleado {
    private static int serie = 100;
    private int claveEmpleado;
    private String nombreEmpleado;
    protected double sueldoBase;
	
	
	
    protected Empleado() {
        this.claveEmpleado = serie;
	serie++;

    }



    protected Empleado(String nombreEmpleado, double sueldoBase) {
        super();
	this.nombreEmpleado = nombreEmpleado;
	this.sueldoBase = sueldoBase;
	this.claveEmpleado = serie;
	serie++;
    }



    public String getNombreEmpleado() {
	return nombreEmpleado;
    }



    public double getSueldoBase() {
	return sueldoBase;
    }



    @Override
    public String toString() {
	return "\nNúmero de empleado: " + claveEmpleado + "\nNombre del empleado: " + nombreEmpleado + "\nSueldo base: " + sueldoBase;
	}
	
    public boolean equals(Empleado otro) {
		
        boolean res = false;
		
	if (this.claveEmpleado == otro.claveEmpleado) {
		res = true;
	}
	return res;
    }
	
    public abstract double calculaSalario(double pres, double ded);

    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
        
        
}

