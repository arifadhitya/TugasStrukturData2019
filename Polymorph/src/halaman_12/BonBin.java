/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_12;
/**
 *
 * @author Arif
 */
public class BonBin {
    static void test(Binatang x){
        x.makan();
        x.tidur();
    }
    
    public static void main(String[] args) {
        Binatang g = new Gajah();
        //Binatang k = new Kerbau();  TIDAK BISA KARENA ABSTRACT
        
        test(g);
        //test(k);
    }

}
