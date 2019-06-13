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
public class IbmDB2 implements Database{
    @Override
    public void connect(){
        System.out.println("ibm db2 connect...");
    }
    
    @Override
    public void disconnect(){
        System.out.println("ibm db disconnect...");
    }
}
