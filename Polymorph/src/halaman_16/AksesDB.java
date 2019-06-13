/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_16;

/**
 *
 * @author Arif
 */
public class AksesDB {
    public static void main(String[] agrs){
        Database d = new IbmDB2();
        d.connect();
        d.disconnect();
    }
}
