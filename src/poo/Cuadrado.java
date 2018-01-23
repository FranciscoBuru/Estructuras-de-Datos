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
public class Cuadrado {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Cuadrado con lado: " + lado;
    }
    
    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerimetro(){
        return 4*lado;
    }
    
    public boolean equals(Cuadrado otro){
        boolean aux = false;
        if(this.calculaArea() == otro.calculaArea() && this.calculaPerimetro() == otro.calculaPerimetro()){
            aux = true;
        }
        return aux;
    }
    
    
    
    
}
