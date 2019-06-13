/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman_11;

import halaman_10.*;
import halaman_7.*;

/**
 *
 * @author Arif
 */
abstract class Binatang {
    abstract void makan();
    abstract void tidur();
    
    void bernafas(){
        System.out.println("bernafas");
    }
}
