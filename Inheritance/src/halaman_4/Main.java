/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_4;

/**
 *
 * @author Arif
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesawat boeing = new Pesawat();
        PesawatTempur f16 = new PesawatTempur() ;
        
        boeing.terbang();
        f16.terbang();
        
        boeing.mendarat();
        f16.mendarat();
        
        //boeing.manuver();  TIDAK BISA KARENA BUKAN METHOD PADA CLASSNYA DAN PARENTNYA
        f16.manuver();
    }
    
}
