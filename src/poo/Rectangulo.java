/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author francisco
 */
//perro
public class Rectangulo {
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo\n La base es de: " + base + "unidades. \n La altura es de: " + altura + " unidades. ";
    
    }
    public double calcArea(){
    
        return base*altura;
    }
    
    public double calcPerimetro(){
        
        return 2*(base+altura);
    }
    
    
}
