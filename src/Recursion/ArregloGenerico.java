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
         
         if(n==0)
             return -1;
         
         else
            return mayor(0,0);
         
     }
     //Falta acabar
     private int mayor(int i, int may){
         
         if(i==n)
             return may;
         
         if(arre[may].compareTo(arre[i])<0){
            
            may = i;
             
         }
         
             return mayor(i+1, may );
         
         
       
     }
     
     //No usar con arreglos ordenados
     public void eliminaOcurrencias(T dato){
            eliminaOcurrencias(dato,0);
     }
     
      private void eliminaOcurrencias(T dato, int i){
         if(i<n){
             
         //Si arre ordenado entonces usa recorreIzq()
             
             if(arre[i].equals(dato)){
                 arre[i]=arre[n-1];
                 arre[n-1]=null;
                 n=n-1;
                 
             }else
                 i=i+1;
         
            eliminaOcurrencias(dato, i);
         }
     }
      
      
      public void ordenaSelDirRec(){
         if(n>0)
            ordenaSelDirRec(0,1, arre[0],0);
     }
     
     private void ordenaSelDirRec(int i, int j,T menor, int pos ){
         
         if(i<n-1){
             if(j<n){
                 if(arre[j].compareTo(menor)<0){
                     menor=arre[j];
                     pos=j;
                 }
                 ordenaSelDirRec(i,j+1,menor,pos);
             }
             else{
                 arre[pos]=arre[i];
                 arre[i]=menor;
                 ordenaSelDirRec(i+1,i+2,arre[i+1],i+1);
             }
         }
     }
     
     public String imprimeArre(){
     
         String res = "";
         
         for(int i =0; i<n; i++){
             res= res + arre[i];
         }
         
         
         return res;
     
     
     }
     
     
     
     
     
     public static void main(String[] args) {
         
         ArregloGenerico a1 = new  ArregloGenerico();
         
         a1.add("a");
        
         a1.add("a");
         
         a1.add("a");
         a1.add("y");
         a1.add("a");
        
         a1.add("a");
         a1.add("a");
         
        
         
         a1.eliminaOcurrencias("y");
         a1.ordenaSelDirRec();
         
         System.out.println(a1.imprimeArre());
         
         
         
         
       
         
    }
    
    
    
    
    
    
    
}
