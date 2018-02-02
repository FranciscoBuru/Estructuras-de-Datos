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
public class FigGeomPolifrom {
    
    
    private String nom;
    private int MAX = 50;
    FigGeome [] figuras = new FigGeome[MAX];
    int n = 0;

    public FigGeomPolifrom() {
    
    }

    public FigGeomPolifrom(String nom) {
        this.nom = nom;
    }
    
    
    public boolean altaFig(double dato, String inicial){
       
        boolean aux = false;
        if(inicial.equals("Cuadrado")){
            Cuadrado c1 = new Cuadrado(dato);
            figuras[n] = c1;
            n++;
            aux=true;
        }
        if(inicial.equals("Circulo")){
            
            Circulo c1 = new Circulo(dato);
            figuras[n] = c1;
            n++;
            aux=true;
            
        }
        
        return aux;
        
    
    }
    
     public void altaFig(double dato1, double dato2){
     
         Rectangulo r1 = new Rectangulo(dato1,dato2);
         figuras[n] = r1;
         n++;
         
     }
     
     public void altaFig(double dato1, double dato2, double dato3){
     
         Triangulo t1 = new Triangulo(dato1,dato2,dato3);
         figuras[n] = t1;
         n++;
         
     
     }
     
     public String areaTodas(){
     
         StringBuilder res= new StringBuilder();
         res.append("Figuras: ").append("\n");
         
         for(int i = 0; i<n; i++){
             res.append(figuras[i].calcArea()).append("\n");
         
         }
         
         return res.toString();
     
     
     }
}
