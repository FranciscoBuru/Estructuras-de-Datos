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
public class Circulo implements FigGeome {
    
    double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        
    }

    @Override
    public double calcArea() {
         return 3.14*radio*radio;
    }

    @Override
    public double calcPerim() {
        return 3.14*(2*radio);
    }
    
    
    
    
    
    
}
