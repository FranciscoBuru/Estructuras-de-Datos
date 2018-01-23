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
public class Persona {
    
    private String nom, pais;
    private int edad;

    public Persona() {
    }

    public Persona(String nom, String pais, int edad) {
        this.nom = nom;
        this.pais = pais;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nom + "\nPais: " + pais + "\nEdad: " + edad;
    }
    
    
    
    
}
