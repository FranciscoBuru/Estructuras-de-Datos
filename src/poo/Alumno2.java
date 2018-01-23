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
public class Alumno2 extends Persona{
    
    String carrera;

    public Alumno2(String carrera) {
        this.carrera = carrera;
    }

    public Alumno2(String carrera, String nom, String pais, int edad) {
        super(nom, pais, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCarrera: " + carrera;
    }
    
    
    
}
