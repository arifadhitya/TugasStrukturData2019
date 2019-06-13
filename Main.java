/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_15;

/**
 *
 * @author Arif
 */
public class Main {
    static void testDosen(Dosen d){
        d.mengajar();
    }
    
    static void testSniper(Sniper d){
        d.menembak();
    }
    
    static void testManusia(Manusia d){
        d.bernafas();
    }
    public static void main(String[] agrs){
        ManusiaSakti budi = new ManusiaSakti();
        testDosen(budi);
        testSniper(budi);
        testManusia(budi);
    }
}
