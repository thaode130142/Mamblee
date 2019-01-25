/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Control.World;
/**
 *
 * @author PC
 */
public class View {
    public static void main (String[] args) {
        World w = new World(2, 9);
        for(int i =0 ; i<w.nRow;i++){
            for(int j = 0; j<w.mCol; j++){
                System.out.println(String.format("%2f", w.getCells()));
            }
            System.out.println();
        }
    }
}
