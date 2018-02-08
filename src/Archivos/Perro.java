/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.Serializable;

/**
 *
 * @author edi
 */
public class Perro implements  Serializable {
    
    private String raza;
    private String color;
    private String nombre;

    public Perro() {
    }

    public Perro(String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", color=" + color + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
