/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author latitude3435
 */
public class Manusia {
    String nama;
    int umur;
    String alamat;

    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method berjalan
    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    // Method berlari
    public void berlari() {
        System.out.println(nama + " sedang berlari.");
    }

    // Optional: untuk menampilkan info manusia
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Alamat: " + alamat);
    }

    // Main method
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("Andi", 25, "Jakarta");
        Manusia manusia2 = new Manusia("Budi", 30, "Bandung");
        Manusia manusia3 = new Manusia("Citra", 22, "Surabaya");
        Manusia manusia4 = new Manusia("Dewi", 28, "Yogyakarta");
        Manusia manusia5 = new Manusia("Eko", 35, "Medan");

        // Memanggil method pada masing-masing objek
        manusia1.berjalan();
        manusia2.berlari();
        manusia3.berjalan();
        manusia4.berlari();
        manusia5.berjalan();

    }
}
