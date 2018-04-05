/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosBidimensionales;

/**
 *
 * @author edi
 */
public class ArreBidim {
    
    public static int sumaRenglones(int [][] arre, int totCol, int totRen){
        
        
        int res = 0;
        
        for(int i = 0; i < totCol ; i++){
            for(int k = 0; k< totRen; k++){
                res = res + arre[k][i];
            }
        }
        
        
        
        return res;
    }
    
    public static void imprimeSudoku(int arre[][]){
        
        String res = "";
        
        for(int i =0; i<9; i++){
            for(int k = 0; k<9 ; k++){
                
                res = res + " " + arre[k][i];
                
            }
            res = res + "\n";
        }
        System.out.println(res);
        
        
    }
    /*
    public static int buscaPosMayotPorColumna(int [][] arre, int totRen, int col){
        
        
      try{
        
        
        if(arre != null){
        
            int max = arre[0][col];
            int pos = 0;
            
            for(int i = 1; i< totRen; i++){
                
                
                
                    if(max<arre[i][col]){
                        max = arre[i][col];
                        pos = i;
                    
                   
                
               
                    
                    
                    
                    }        
            }
        
            return pos; 
        }
                
        else
            return -1;
    
      }catch(Exception NullPointerException){
            return -1;
            
        }    
    */    
        
    
    public static void main(String[] args) {
        
        int arre[][] = new int [10][10];
        
         arre[0][0] = 1;
        arre[0][1] = 7;
        arre[0][2] = 4;
        arre[0][3] = 9;
        arre[0][4] = 0;
        arre[0][5] = 0;
        arre[0][6] = 2;
        arre[0][7] = 8;
        arre[0][8] = 5;
        
        arre[1][0] = 3;
        arre[1][1] = 0;
        arre[1][2] = 9;
        arre[1][3] = 2;
        arre[1][4] = 0;
        arre[1][5] = 8;
        arre[1][6] = 1;
        arre[1][7] = 0;
        arre[1][8] = 6;
        
        arre[2][0] = 2;
        arre[2][1] = 8;
        arre[2][2] = 6;
        arre[2][3] = 5;
        arre[2][4] = 1;
        arre[2][5] = 0;
        arre[2][6] = 4;
        arre[2][7] = 0;
        arre[2][8] = 3;
        
        arre[3][0] = 8;
        arre[3][1] = 0;
        arre[3][2] = 7;
        arre[3][3] = 0;
        arre[3][4] = 5;
        arre[3][5] = 0;
        arre[3][6] = 0;
        arre[3][7] = 0;
        arre[3][8] = 1;
        
        arre[4][0] = 0;
        arre[4][1] = 4;
        arre[4][2] = 3;
        arre[4][3] = 7;
        arre[4][4] = 2;
        arre[4][5] = 1;
        arre[4][6] = 9;
        arre[4][7] = 0;
        arre[4][8] = 0;
        
        arre[5][0] = 6;
        arre[5][1] = 2;
        arre[5][2] = 0;
        arre[5][3] = 8;
        arre[5][4] = 0;
        arre[5][5] = 3;
        arre[5][6] = 0;
        arre[5][7] = 5;
        arre[5][8] = 4;
        
        arre[6][0] = 7;
        arre[6][1] = 3;
        arre[6][2] = 0;
        arre[6][3] = 1;
        arre[6][4] = 6;
        arre[6][5] = 0;
        arre[6][6] = 0;
        arre[6][7] = 0;
        arre[6][8] = 0;
        
        arre[7][0] = 9;
        arre[7][1] = 0;
        arre[7][2] = 0;
        arre[7][3] = 0;
        arre[7][4] = 0;
        arre[7][5] = 5;
        arre[7][6] = 0;
        arre[7][7] = 0;
        arre[7][8] = 2;
        
        arre[8][0] = 4;
        arre[8][1] = 6;
        arre[8][2] = 0;
        arre[8][3] = 3;
        arre[8][4] = 0;
        arre[8][5] = 9;
        arre[8][6] = 0;
        arre[8][7] = 0;
        arre[8][8] = 7;
        
        
        System.out.println(sumaRenglones(arre,9,9));
        
        imprimeSudoku(arre);
        
        
        
    }
}
