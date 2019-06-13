/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_9;

/**
 *
 * @author Arif
 */
public class BonBin {
    static void test(Gajah x){
        x.makan();
        x.tidur();
    }
    
    static void test(Kerbau x){
        x.makan();
        x.tidur();
    }
    
    public static void main(String[] args) {
        Gajah g = new Gajah();
        Kerbau k = new Kerbau();
        
        test(g);
        test(k);
    }

}
