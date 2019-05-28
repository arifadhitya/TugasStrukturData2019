/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pencarianboolean;

import java.util.Scanner;

/**
 *
 * @author common
 */
public class pencarianBoolean {
    static boolean data (String data, String cari){
        boolean dat1=false;
        if (data.equals(cari)){
            dat1 = true;
        }
        return dat1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        String cari;
        String []data= {"bisection", "secant"};
        String hasil = "tidak ditemukan";
        String compr = "tidak ditemukan";
        System.out.print("Masukkan kata\nbisection/secant : ");
        cari = input.next();
        for (int i = 0; (i<data.length)&&(hasil.equals(compr)); i++) {
            if (data(data[i], cari)){ 
                hasil = "ditemukan";
            }else{
                hasil = "tidak ditemukan";
            }
        }
        System.out.println("kata "+cari+" "+hasil);   
    }
}
