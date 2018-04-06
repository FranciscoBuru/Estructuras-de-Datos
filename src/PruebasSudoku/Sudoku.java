/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasSudoku;

/**
 *
 * @author FARAMBURA
 */
public class Sudoku {
    
    int sudoku[][];

   
    public Sudoku() {
        
        sudoku= new int [9][9];
        
    }
    
    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    
    }
    
    private boolean resCol(int col, int num){
        
        boolean res = true;
        
        for(int i = 0; i<9; i++){
            
            if(sudoku[i][col] == num){
                res = false;
                
            }
        }
        return res;
        
    
    }
     
    private boolean resFila(int fil, int num){
        
        boolean res = true;
        
        for(int i = 0; i<9; i++){
            
            if(sudoku[fil][i] == num){
                res = false;
                
            }
        }
        return res;
        
    
    }
     
    private  boolean cuadro(int fila, int col, int num){
        
        boolean res = true;
        
        for(int i = fila; i<fila+3; i++){
            for(int k = col; k < col+3; k++){
                if(sudoku[i][k] == num){
                    res = false;
                }
            }
        }
        return res;
        
    
    }
    
    public boolean valida(int fila, int columna, int num){
    
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
        
        if(resCol(columna , num) && resFila(fila, num) && cuadro(fil, col, num)){
            res = true;
        }
        
        return res;
    
    
    
    }
    
    public boolean resuelve(){
        
        for(int f =0; f<9 ; f++){
            for(int c = 0; c < 9 ; c++){
                if(sudoku[f][c] == 0){
                    for(int n =1; n<10 ; n++){
                        if(valida(f,c,n)){
                            sudoku[f][c] = n;
                            if(resuelve()){
                                return true;
                            }
                            else{
                                sudoku[f][c] = 0;
                            }
                        
                        }
                    
                    
                    }
                return false;
                
                
                }
        
        
            }
        }
        return true;
        
        
        
        
    }
    
    
    
     public  void imprimeSudoku(){
        
        String res = "";
        
        for(int i =0; i<9; i++){
            for(int k = 0; k<9 ; k++){
                
                if(k==3 || k == 6 ){
                    res = res + " " + "|" + " ";
                }
                
                
                res = res + " " + sudoku[i][k];
                
            }
           
            if(i==2 || i==5){
                    res = res + "\n " + "------------------------" + "\n";
            }
            else
                 res = res + "\n";
        }
        System.out.println(res);
        
        
    }

    
    
    public static void main(String[] args) {
        
        int arre[][] = new int [9][9];
        
        arre[0][0] = 2;
        arre[0][1] = 2;
        arre[0][2] = 0;
        arre[0][3] = 3;
        arre[0][4] = 0;
        arre[0][5] = 8;
        arre[0][6] = 0;
        arre[0][7] = 0;
        arre[0][8] = 0;
        
        arre[1][0] = 0;
        arre[1][1] = 0;
        arre[1][2] = 6;
        arre[1][3] = 4;
        arre[1][4] = 0;
        arre[1][5] = 0;
        arre[1][6] = 0;
        arre[1][7] = 5;
        arre[1][8] = 0;
        
        arre[2][0] = 0;
        arre[2][1] = 0;
        arre[2][2] = 0;
        arre[2][3] = 7;
        arre[2][4] = 0;
        arre[2][5] = 0;
        arre[2][6] = 0;
        arre[2][7] = 9;
        arre[2][8] = 0;
        
        arre[3][0] = 0;
        arre[3][1] = 0;
        arre[3][2] = 1;
        arre[3][3] = 0;
        arre[3][4] = 0;
        arre[3][5] = 0;
        arre[3][6] = 0;
        arre[3][7] = 0;
        arre[3][8] = 8;
        
        arre[4][0] = 7;
        arre[4][1] = 0;
        arre[4][2] = 0;
        arre[4][3] = 0;
        arre[4][4] = 9;
        arre[4][5] = 0;
        arre[4][6] = 3;
        arre[4][7] = 0;
        arre[4][8] = 0;
        
        arre[5][0] = 3;
        arre[5][1] = 0;
        arre[5][2] = 0;
        arre[5][3] = 0;
        arre[5][4] = 0;
        arre[5][5] = 0;
        arre[5][6] = 0;
        arre[5][7] = 0;
        arre[5][8] = 5;
        
        arre[6][0] = 0;
        arre[6][1] = 0;
        arre[6][2] = 0;
        arre[6][3] = 0;
        arre[6][4] = 0;
        arre[6][5] = 2;
        arre[6][6] = 0;
        arre[6][7] = 0;
        arre[6][8] = 6;
        
        arre[7][0] = 0;
        arre[7][1] = 8;
        arre[7][2] = 0;
        arre[7][3] = 0;
        arre[7][4] = 1;
        arre[7][5] = 0;
        arre[7][6] = 5;
        arre[7][7] = 0;
        arre[7][8] = 0;
        
        arre[8][0] = 5;
        arre[8][1] = 2;
        arre[8][2] = 0;
        arre[8][3] = 0;
        arre[8][4] = 8;
        arre[8][5] = 0;
        arre[8][6] = 0;
        arre[8][7] = 0;
        arre[8][8] = 0;
        
        
        Sudoku s1  = new Sudoku(arre);
        
      
        
        System.out.println(s1.resuelve());
        
        s1.imprimeSudoku();
        
        
        
        
    }
   
    
    
    
}
