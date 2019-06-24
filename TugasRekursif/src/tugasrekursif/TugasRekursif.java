/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrekursif;

import java.util.Scanner;

/**
 *
 * @author common
 */
public class TugasRekursif {

    /**
     * @param args the command line arguments
     */
    static void rekursifPerulangan(int input){
        if(input<=10){
            int pangkat=(int)Math.pow(input,2);
            System.out.println(input+"^2="+pangkat);
            rekursifPerulangan(1+input);
        }
    }
    
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("=========================== Rekursif ===========================");
        System.out.println("Menampilkan angka sampai 10 dengan bilangan kuadratnya");
        System.out.print("Masukkan angka 1 sampai 10 : ");
        int input = baca.nextInt();
        rekursifPerulangan(input);
    }
}
