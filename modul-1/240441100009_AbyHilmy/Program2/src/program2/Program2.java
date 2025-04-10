/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program2;

/**
 *
 * @author latitude3435
 */
import java.util.Scanner;

// Class Mahasiswa
class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    // Constructor
    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Alamat : " + alamat);
        System.out.println("----------------------------");
    }
}

// Program utama
public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah minimal objek mahasiswa
        int jumlah = 3;

        // Array untuk menyimpan objek Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlah];

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            String nama = input.nextLine();
            System.out.print("NIM    : ");
            String nim = input.nextLine();
            System.out.print("Prodi  : ");
            String prodi = input.nextLine();
            System.out.print("Alamat : ");
            String alamat = input.nextLine();

            // Membuat objek Mahasiswa dan menyimpannya ke array
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, prodi, alamat);
            System.out.println();
        }

        // Menampilkan semua data mahasiswa
        System.out.println("=== Daftar Mahasiswa ===");
        for (int i = 0; i < jumlah; i++) {
            daftarMahasiswa[i].tampilkanData();
        }

        input.close();
    }
}
