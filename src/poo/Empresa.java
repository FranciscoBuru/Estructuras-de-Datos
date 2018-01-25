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
    
        Administrativo a1 = new Administrativo(departamento, telefono, nombreEmpleado, sueldoBase);
        arreA[ad]=a1;
        ad++;
        
    }
    
    public void altaOpe(int horasExtra, String nombreEmpleado, double sueldoBase){
    
        Operario o1 = new Operario( horasExtra,  nombreEmpleado,  sueldoBase);
        arreO[op]=o1;
        op++;
    
    
    }
    
    
    
    
    
    
    
    
}
