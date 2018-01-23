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
public class Alumno implements Comparable <Alumno>{
    
    private static int serie = 100;
    private int claveUnica, totalCalif;
    private String nomAlumno;
    private double [] calif;

    public Alumno() {
        calif= new double[100];
        totalCalif=0;
        claveUnica = serie;
        serie++;
    }

    public Alumno(int clave){
    
        this.claveUnica=clave;
    }
    
    
    public Alumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
        calif = new double[100];
        totalCalif=0;
        claveUnica = serie;
        serie++;
    }
    
    public boolean altaCalificacion(double nueva){
    
        boolean aux = false;
        if(totalCalif<100){
            calif[totalCalif]=nueva;
            aux = true;
        }
        
        
        return aux;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    @Override
    public String toString() {
        return "Alumno:" + nomAlumno +"\nClave unica: \n" + claveUnica + ",\nTotal calificaicones=" + totalCalif;
    }
    
    public double calcProm(){
        double suma = 0;
        for(int i = 1; i<totalCalif;i++){
            
            suma = suma + calif[i];
        
        }
        return suma;
    
    }

    public int getClaveUnica() {
        return claveUnica;
    }
    
    public boolean equals(Alumno otro){
    
        boolean res = false;
        if(claveUnica==otro.getClaveUnica()){
            res= true;
        }
        
    return res;
    }
    
    //Equals
    //implementar 
    
    public int compareTo(Alumno otro) {
        return Integer.compare(this.claveUnica, otro.claveUnica);
    }

    public int getTotalCalif() {
        return totalCalif;
    }
    
    
    
    
    
    
    
    
    
    
    
}
