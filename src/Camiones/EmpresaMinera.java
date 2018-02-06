/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Camiones;

/**
 *
 * @author Francisco Aramburu
 */
public class EmpresaMinera {
    
    private String empresaMinera;
    private Camion [] arre;
    private final int  MAX = 50;
    private int n;

    public EmpresaMinera() {
        arre = new Camion [MAX];
        n=0;
        
    }

    public EmpresaMinera(String empresaMinera) {
        arre = new Camion [MAX];
        n=0;
        this.empresaMinera = empresaMinera;
        
    }
    
    public void altaCamion(double capTon, String marca, String nimMotor, String placas){
        DeVolteo v1 = new DeVolteo(capTon, marca, nimMotor,placas);
        arre[n]= v1;
    
    }
    
    public void altaCamion(int pasaj, String marca, String nimMotor, String placas){
        DeVolteo v1 = new DeVolteo(pasaj, marca, nimMotor,placas);
        arre[n]= v1;
    
    }
    
    public String camPasaj(){
        
        StringBuilder res= new StringBuilder();
        
        for (int i =0; i<n ; i++){
            if(arre[i] instanceof DePasajeros){
                res.append(arre[i].toString());
            }
        
        }
        return res.toString();
    }
    
    public void actVolteo(double nueva, String otra){
    
        int i = 0;
        boolean aux = true;
        while(i<n && aux){
        
            if(arre[i] instanceof DeVolteo)
                if(arre[i].getPlacas().equals(otra)){
                    ((DeVolteo)arre[i]).setCapTon(nueva);  //Casteo
                    aux = false;
                }
            
        
        }
        i++;
        
    }
    
     public int marcaCamPasaj(String otra){
        
        StringBuilder res= new StringBuilder();
        int aux =0;
        for (int i =0; i<n ; i++){
            if(arre[i] instanceof DePasajeros){
                if(arre[i].getMarca().equals(otra))
                    aux++;
                    }
        
        }
        return aux;
    }
     
     
     public double capVolteo(){
    
      
        double aux=0;
        
        for(int i=0; i <n; i++){
        
            if(arre[i] instanceof DeVolteo){
                aux = aux +((DeVolteo)arre[i]).getCapTon();
                }
            
        
        }
        return aux;
        
        
    }
     /*
     public static void main(String[] args) {
        EmpresaMinera e = new EmpresaMinera("aloha");
        
        e.altaCamion(123.23 , "mote", "placas", "kajsddh");
        e.altaCamion(50, "mot", "placass", "kajsdh");
        e.altaCamion(200.230 , "moter", "plarcas", "kajsrddh");
        
        
         System.out.println(e.capVolteo());
         System.out.println(e.marcaCamPasaj("mot"));
         System.out.println(e.camPasaj());
         
         
         
    }
    */
}
