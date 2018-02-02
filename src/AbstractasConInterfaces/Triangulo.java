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
public class Triangulo implements FigGeome{
    
    private double l1,l2,l3;

    public Triangulo() {
    }

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    @Override
    public double calcArea(){
    
        return (l1*l2)/2;
    }
    
    @Override
    public double calcPerim(){
    
        return l1+l2+l3;
    
    }
    
}
