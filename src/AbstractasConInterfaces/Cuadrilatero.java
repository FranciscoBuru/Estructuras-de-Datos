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
//Abstracta
//Primer ejercicio de Polimorfismo, 9 cuaderno de ejercicios.
public abstract class Cuadrilatero implements FigGeome {
    
    private double altura , base ;
    
    protected Cuadrilatero(){
    
    }
    
    protected Cuadrilatero(double l1, double l2){
        base=l1;
        altura=l2;
    
    }
    @Override
    public double calcArea(){
    
        return base*altura;
        
    }
    
    @Override
    public double calcPerim(){
    
        return 2*(base+altura);
        
    }

    
    
    
    
}
