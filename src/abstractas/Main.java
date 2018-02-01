/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

/**
 *
 * @author edi
 */
public class Main {

    public static void main(String[] args) {
        Admisitrativo e = new Admisitrativo("casa", "555555552", "Pedro", 56.2);
        System.out.println(e);
        Operario o = new Operario(15,"Juan",56.2);
        
        System.out.println(o);
        System.out.println(e.calculaSalario(25, 5));
        System.out.println(o.calculaSalario(25, 5,1));
        System.out.println("Hola");
    }
    
}

