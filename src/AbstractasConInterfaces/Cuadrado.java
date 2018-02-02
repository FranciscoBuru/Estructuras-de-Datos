/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractasConInterfaces;

/**
 *
 * @author Francisco Aramburu
 */

//Clase particular
//Primer ejercicio de Polimorfismo, 9 cuaderno de ejercicios.
public class Cuadrado extends Cuadrilatero {
    
    private double l1;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double l1) {
        super(l1, l1);
        this.l1=l1;
    }
    
    
    
}
