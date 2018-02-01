/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author edi
 */
//Marca error hasta que sobreescribas los metodos en interface
public class ClaseConInterface implements EjemploInterface {
    
    @Override
    public int haceAlgo(){
    
        return 1;
    }
    @Override
    public boolean haceOtraCosa(double dato){
    
        return true;
    }
    
    
    
}
