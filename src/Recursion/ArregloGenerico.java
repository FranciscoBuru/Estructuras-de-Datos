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
     
     public int Mayor(){
        if(n== 0)
            return -1;
        else
             return Mayor(0,0);
    }
    
    private int Mayor(int posM, int i){
        if(i == n)
            return posM;
        else{
            if(arre[i].compareTo(arre[posM]) > 0)
                posM = i;
            return Mayor(posM, i + 1);
        }
    }
    
    public int eliminaOcurrencias(T dato){
        return eliminaOcurrencias(dato,0,0);
    }
    
    private int eliminaOcurrencias(T dato, int cont, int i){
        if(i==n)
            return cont;
        else{
            if(arre[i].equals(dato)){
                arre[i]=arre[n-1];
                arre[n-1]=null;
                n=n-1;
                cont=cont+1;
            }else
                i=i+1;
            return eliminaOcurrencias(dato,cont,i);
        }
    }
    
    public void ordenaSelDirRec(){
        if(n>0)
        ordenaSelDirRec(0,1, arre[0],0);
    }
    
    private void ordenaSelDirRec(int i, int j,T menor, int pos ){
        
        if(i<n-1)
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
     
       
     
     public static void main(String[] args) {
         
         ArregloGenerico a1 = new  ArregloGenerico();
         ArregloGenerico a2 = new  ArregloGenerico();
         
         a1.add("a");
         a1.add("b");
         a1.add("c");
         a1.add("d");
         a1.add("e");
         a1.add("g");
         a1.add("h");
         a1.add("i");
        
         a2.add(30);
         a2.add(50);
         a2.add(5);
         a2.add(5);
         a2.add(10);
         
         
         
         System.out.println(a1.toString());
         System.out.println(a2.Mayor());
         a2.eliminaOcurrencias(5);
         System.out.println(a2.toString());
         a2.ordenaSelDirRec();
         System.out.println(a2.toString());   
    }   
    
}
