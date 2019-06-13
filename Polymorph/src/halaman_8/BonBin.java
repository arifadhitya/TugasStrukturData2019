/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_8;

/**
 *
 * @author Arif
 */
public class BonBin {
    public static void main(String[] args) {
        Binatang g = new Gajah();
        g.makan();
        g.tidur();
        ((Gajah)g).duduk();
    }

}
