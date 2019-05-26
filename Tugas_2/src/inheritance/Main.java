/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author common
 */
public class Main {
    public static void main (String[] arg){
        perpustakaan pegawai = new perpustakaan();
        pegawai.pendataanBuku();
        pegawai.pembuatanKartuPinjam();
        pegawai.peminjamanBuku();
        System.out.println(" ");
        System.out.println("Jumlah buku   : "+pegawai.jumlahBuku);
        System.out.println("Jumlah pegawai : "+pegawai.pegawai);
        System.out.println("Jumlah tamu   : "+pegawai.tamu);
    }
}
