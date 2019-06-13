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
public class Mysql implements Database{
    @Override
    public void connect(){
        System.out.println("mysql connect...");
    }
    
    @Override
    public void disconnect(){
        System.out.println("mysql disconnect...");
    }
}
