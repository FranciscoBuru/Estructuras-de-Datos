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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Administrativo e = new Administrativo("casa", "555555552", "Pedro", 56.2);
        System.out.println(e);
        Operario o = new Operario(15,"Juan",56.2);
        
        System.out.println(o);
        System.out.println(e.calculaSalario(25, 5));
        System.out.println(o.calculaSalario(25, 5,1));
        
    }
    
}
