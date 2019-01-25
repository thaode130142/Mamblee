/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Random;


/**
 *
 * @author PC
 */
public class World {
    public int nRow , mCol ;
    public double[][] cells;
    public World(int nRow, int mCol) {
        this.nRow = nRow;
        this.mCol = mCol;
        Random ran = new Random();
        cells = new double[mCol][mCol];
        for(int i = 0; i<nRow;i++){
            for(int j = 0; j<mCol; j++){
                cells[i][j]= ran.nextDouble();
            }
        }
    }
    public double getcells(int i , int j){
        return cells[i][j];
    }

    public int getnRow() {
        return nRow;
    }

    public void setnRow(int nRow) {
        this.nRow = nRow;
    }

    public int getmCol() {
        return mCol;
    }

    public void setmCol(int mCol) {
        this.mCol = mCol;
    }

    public double[][] getCells() {
        return cells;
    }

    public void setCells(double[][] cells) {
        this.cells = cells;
    }
    

    public World(int nRow, int mCol, double[][] cells) {
        this.nRow = nRow;
        this.mCol = mCol;
        this.cells = cells;
    }
    
    
}
