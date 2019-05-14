/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author common
 */
public class Tugas_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        int[] nx = new int[7];
        int kecil=999,besar=0,jumlah=0;
		
        for (int x=1; x<=nx.length; x++)
        {
          System.out.print("Masukan Nilai Praktikum ke-"+x+" = ");
          nx[x-1] = inputUser.nextInt();
		  
          if(nx[x-1]<kecil)
              kecil=nx[x-1];
		  
          if(nx[x-1]>besar)
              besar=nx[x-1];
		  
          jumlah+=nx[x-1];

        }
        float rata=jumlah/nx.length;
        System.out.println("----------------------------------------");
        System.out.println("Rata-rata Nilai Praktikum Anda Adalah = "+rata);
        System.out.println("Nilai Praktikum Tertinggi Adalah = "+besar);
        System.out.println("Nilai Praktikum Terrendah Adalah = "+kecil);
        for (int y=1; y<=nx.length; y++)
        {  
          System.out.print(nx[y-1]+", ");
        }
        System.out.println(" ");
    }
    
}
