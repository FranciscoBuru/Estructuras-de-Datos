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
public class ComplejoVacacional {
    
    private String nombre;
    private int numAlb;
    private Rectangulo [] albercas;

    public ComplejoVacacional() {
        albercas = new Rectangulo[10];
        this.numAlb = 0;
    }

    public ComplejoVacacional(String nombre, int numAlb) {
        albercas = new Rectangulo[10];
        this.nombre = nombre;
        this.numAlb = 0;
    }
    
    public double calcLona(){
        int i =0;
        double suma =0;
        
        for(i=0;i<numAlb;i++){
            suma = suma + (albercas[i].getAltura()*albercas[i].getBase());
        }
        return suma;
    }
    
    public double calcCerca(){
        int i =0;
        double suma =0;
        
        for(i=0;i<numAlb;i++){
            suma = suma + 2*(albercas[i].getAltura()+albercas[i].getBase());
        }
        return suma;
    }
    
    public boolean agregarAlberca(double base, double altura){
        boolean aux = false;
        if(numAlb<10){
            Rectangulo r = new Rectangulo(base,altura);
            albercas[numAlb]=r;
            numAlb++;
            aux=true;
        }
        return aux;
     }

    public int getNumAlb() {
        return numAlb;
    }
    
    
}
