/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author EDI
 */
public class Escuela {
    
   private  String nom, direccion;
   private  int numAl;
   private Alumno [] arreAl;

    public Escuela() {
        arreAl = new Alumno[50];
        numAl=0;
    
    }

    public Escuela(String nom, String direccion) {
        this.nom = nom;
        this.direccion = direccion;
        arreAl = new Alumno[50];
        numAl=0;
    }
    
    public void agregaAlumno(String nom){
        if(numAl<arreAl.length){
            Alumno a = new Alumno(nom);
            arreAl[numAl]=a;
            numAl++;
        }
    }
    
    public void altaCalif(double calif , int clave){
    
        boolean resp=false;
        int pos;
        pos=buscaClave(clave);
        if(pos>0){
            resp = arreAl[pos].altaCalificacion(calif);
        }
        
    }
    
    public int buscaClave(int clave){
        
        int i,d,c;
        i=0;
        d= numAl;
        c=d/2;
        
        Alumno alum = new Alumno(clave);
        
        
        while(i<=d && !arreAl[c].equals(alum) ){
            
            if(arreAl[c].compareTo(alum)<0){
                i=c+1;
            }
            else
                d=c-1;
            
            c = (i+d)/2;
            
            if(i>d)
                c= (i+1)*-1;
        
            
        }
        
        
       return c; 
    }
        
    
    
    public String consultaClave(int clave){
        String res;
        int pos;
        pos = buscaClave(clave);
        if(pos>=0){
            res = arreAl[pos].toString();
        }
        else 
            res=null;
        
        return res;
    
    }
    
    
    
    public String reporteAlumnos(){
    
        StringBuilder d = new StringBuilder("\nLista de alumnos;\n");
        
        for (int i = 0; i<numAl;i++){
            Alumno a= arreAl[i];
            d.append(a.getNomAlumno()).append(" ").append(a.calcProm()).append("\n");
        }
        return d.toString();
    
    }
    
    public String masMaterias(){
    
        String res;
        if(numAl>0){
             int max;
             max = arreAl[0].getTotalCalif();
             int pos =0;
             for(int i =1; i<numAl;i++){
                if(arreAl[i].getTotalCalif()>max){ //si en vez de get estuvieras contad.... de más
                 max= arreAl[i].getTotalCalif();   // Se arregla con un aux
                 pos=i;
             }
          }
             res= arreAl[pos].getNomAlumno();
        
        
        }
        else
            res=null;
        
        return res;
    
    }
        
     
    }
    
     
   
    
    
   
   

