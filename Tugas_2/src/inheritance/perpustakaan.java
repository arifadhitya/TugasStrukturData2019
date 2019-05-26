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
public class perpustakaan {
    int jumlahBuku = 112;
    int tamu = 14;
    int pegawai = 8;
    void pendataanBuku(){
        System.out.println("Pegawai mencatat buku yang dipinjam dan dikembalikan\n");
    }
    void pembuatanKartuPinjam(){
        System.out.println("Pegawai membuatkan kartu peminjaman\n");
    }
    void peminjamanBuku(){
        System.out.println("Tamu mengisi form peminjaman\n");
    }
}
