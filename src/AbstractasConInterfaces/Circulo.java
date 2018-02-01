/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractasConInterfaces;

/**
 *
 * @author edi
 */
//Clase particular
public class Circulo implements FigGeome {
    
    double radio, perimetro;

    public Circulo() {
    }

    public Circulo(double radio, double perimetro) {
        this.radio = radio;
        this.perimetro = perimetro;
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
