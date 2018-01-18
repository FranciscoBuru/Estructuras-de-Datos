/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author francisco
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurante v1 = new Restaurante();
        v1.agregaMesa(1);
        v1.agregaMesa(1);
        v1.agregaMesa(1);
        v1.agregaMesa(1);
        v1.agregaMesa(1);
        
        
        System.out.println(v1.calcManteles());
        System.out.println(v1.calcMetros());
    }
    
}
