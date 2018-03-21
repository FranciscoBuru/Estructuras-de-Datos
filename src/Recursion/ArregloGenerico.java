/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author edi
 * @param <T>
 */
public class  ArregloGenerico<T extends Comparable<T>>{
    
    private int n;
    private T arre[];
    private final int MAX = 500;

    
    public ArregloGenerico() {
        n=0;
        arre = (T[]) new Comparable[MAX];
    
    }
    
    public ArregloGenerico(int max) {
        n=0;
        arre = (T[]) new Comparable[max];
    
    }
    
    
    public int buscSec(T dato){
    
    
        return buscSec(dato, n-1);
    }
    
     private int buscSec(T dato, int k){
         
         if(k>-1){
            if(arre[k].equals(dato)){
                return k;
            }
            else
                return buscSec(dato, k-1);
         }
         else
             return -1;
    }
     
     
     
     public void add(T dato){
         
         arre[n]= dato;
         n++;
         
     }
     
     
     public int buscBin(T dato){
     
         return buscBin(dato, 0, n/2, n -1 );
     
     } 
     
     public int buscBin(T dato, int izq, int cen, int der){
         
         if(der<izq){
            
             return -1*(der+1);
             
         }
         //Se se comparan dos datos diferentes truena, escribir con try-catch
         else if(arre[cen].compareTo(dato)==0){
             
             return cen;
         }
         
         else if(arre[cen].compareTo(dato)>0){
             
             return buscBin(dato, izq, (izq+cen-1)/2 , cen-1);
         }
         else 
            return buscBin(dato, cen+1, (der+cen+1)/2 , der);
         
         
    }
     
     
     public String toString(){
         
         return toString(n-1,0);
     }
     
     public String toString(int k, int i){
         
         if(i==k){
             return arre[k] + "";
             
        }
        else
             return arre[i] + "  " + toString(k,i+1);
         
     }
     
     public int mayor(){
         
         return mayor(0,0);
     }
     //Falta acabar
     private int mayor(int i, int may){
         
         if(arre[may].compareTo(arre[i])>0){
         
         }
         
         
         return 1;
     }
     
     
     
     
     
     public static void main(String[] args) {
         
         ArregloGenerico a1 = new  ArregloGenerico();
         
         a1.add("a");
         a1.add("b");
         a1.add("c");
         a1.add("d");
         a1.add("e");
         
         a1.add("g");
         a1.add("h");
         a1.add("i");
        
         
         
         System.out.println(a1.toString());
         
         
    }
    
    
    
    
    
    
    
}
