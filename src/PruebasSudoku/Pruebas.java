/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasSudoku;

//No funciona, no lo hagas estatico y crea una clase sudoku...
//En principio funciona pero debes de cambiarlo. No sirve si cuando se regresa
//a la casilla anterior hay un numero =! 0


/**
 *
 * @author edi
 */
public class Pruebas {
    
    
    public static boolean colum(int arre [][], int col, int num){
        
        boolean res = true;
        
        for(int i = 0; i<9; i++){
            
            if(arre[i][col] == num){
                res = false;
                
            }
        }
        return res;
        
    
    }
    
    public static boolean fil(int arre [][], int fil, int num){
        
        boolean res = true;
        
        for(int i = 0; i<9; i++){
            
            if(arre[fil][i] == num){
                res = false;
                
            }
        }
        return res;
        
    
    }
    
    public static boolean cuadro(int arre [][], int fila, int col, int num){
        
        boolean res = true;
        
        for(int i = fila; i<fila+3; i++){
            for(int k = col; k < col+3; k++){
                if(arre[i][k] == num){
                    res = false;
                }
            }
        }
        return res;
        
    
    }
    
    
    
    
    
    
    public static boolean posi(int arre [][], int fila, int columna, int num){
        
        
        boolean res = false;
        
        int col, fil;
        
        
        if(columna<3){
            col = 0;
        }
        else if(columna<6){
            col = 3;
        }
        else{
            col = 6;
        }
        
        
        if(fila<3){
            fil = 0;
        }
        else if(fila<6){
            fil = 3;
        }
        else{
            fil = 6;
        }
        
        
        
        if(colum(arre , columna, num) && fil(arre, fila, num) && cuadro(arre, fil, col, num)){
            res = true;
        }
        
        
        
        return res;
    }
    
    public static boolean resuelve(int arre[][]){
        
        if(resuelve(arre,0,0)){
            return true;
        }
        else
            return false;
    
    }
    
    
    
    public static boolean resuelve(int arre [][], int fila, int columna){
        
        if(columna==9){
            columna=0;
            fila++;
        }
        
        
        if(arre[fila][columna]==0){
            
            for(int i =1; i<10; i++){
                
                if(posi(arre, fila, columna, i)){
                    
                    arre[fila][columna] = i;
                    
                    
                    
                    
                    
                    
                    if(resuelve(arre,fila,columna+1)){
                        return true;
                    }
                    else{
                        arre[fila][columna] = 0;
                        
                    }    
                }
                
            }
            return false;
            
            
        }
        else
           if(resuelve(arre,fila,columna+1)){
                        return true;
                    }
                    
        
        
        return true;
        
        
        
    }
    
    public static void imprimeSudoku(int arre[][]){
        
        String res = "";
        
        for(int i =0; i<9; i++){
            for(int k = 0; k<9 ; k++){
                
                res = res + " " + arre[i][k];
                
            }
            res = res + "\n";
        }
        System.out.println(res);
        
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        int arre [][] = new int [10][10];
        
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
        
        
        resuelve(arre);
        
        imprimeSudoku(arre);
        
        
        
    }
    
}
