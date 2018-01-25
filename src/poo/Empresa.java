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
public class Empresa {
    
    private String nomEmp, duenio, direccion;
    private Operario[] arreO;
    private Administrativo[] arreA;
    private int op, ad;

    public Empresa() {
    
        arreO = new Operario[200];
        arreA = new Administrativo [200];
        op =0;
        ad=0;
    
    }

    public Empresa(String nomEmp, String duenio, String direccion) {
        this.nomEmp = nomEmp;
        this.duenio = duenio;
        this.direccion = direccion;
        arreO = new Operario[200];
        arreA = new Administrativo [200];
        op =0;
        ad=0;
    }
    
    public void altaAdm(String departamento, String telefono, String nombreEmpleado, double sueldoBase){
    
        if(arreA.length > ad){
            Administrativo a1 = new Administrativo(departamento, telefono, nombreEmpleado, sueldoBase);
            arreA[ad]=a1;
            ad++;
        }
    }
    
    public void altaOpe(int horasExtra, String nombreEmpleado, double sueldoBase){
        if(arreO.length > op){
            Operario o1 = new Operario( horasExtra,  nombreEmpleado,  sueldoBase);
            arreO[op]=o1;
            op++;
        }
    
    }
    
    public String generaRepAdmin(){
        StringBuilder cad = new StringBuilder();
        for (int i = 0; i<ad;i++){
            
            cad.append(arreA[i].getNombreEmpleado()).append(arreA[i].getSueldoBase()).append("\n");
           
        }
        return cad.toString();
    
    }
    
    public void subeSueldoAdmin(int n, int num){
    
        num = num/10;
        int i;
        i = buscaAdmin(num);
   
        if(i>0){
           arreA[i].setSueldoBase(arreA[i].getSueldoBase()*(1+n));
        }
    }
    
    //También podrias hacer busqueda binaria... 
    //En vez de dos metodos pones solo uno qe busque un object
    public int buscaAdmin(int n){
    
    
        int i =0;
        boolean aux = true;
        while(i<ad&&aux){
        
            if(n == arreA[i].getClaveEmpleado()){
                aux = false;
            }
        } 
        if(aux){
            i = -1*i;
        }
        return i;
    
    
    }
    
    public void setDepartamento(String dep, int n){
    
        int i = buscaAdmin(n);
        boolean aux = true;
        
        if(i>0){
            arreA[i].setDepartamento(dep);
        }
    }
    
    public int buscaOper(int n){
    
    
         int i =0;
        boolean aux = true;
        while(i<op&&aux){
        
            if(n == arreO[i].getClaveEmpleado()){
                aux = false;
            }
        } 
        if(aux){
            i = -1*i;
        }
        return i;
    
    
    }
    
    
    public String getCobroOper(int n, double a1, double a2, double a3){
    
        String res = null;
        int i= buscaOper(n);
        if(i>0){
            
            res = arreO[i].getNombreEmpleado() + arreO[i].calculaSalario(a1, a2, a3);
        
        }
    
        return res;
    }   
    
    public String SueldoMin(double suel){
    
        StringBuilder cad = new StringBuilder();
        int aux =0;
        for (int i = 0 ; i < op ; i++){
        
            if(suel>arreO[i].getSueldoBase()){
               cad.append(arreO[i].getNombreEmpleado());
               aux ++;
        }
    
    }
        return cad.toString();
    
    
    }


}
