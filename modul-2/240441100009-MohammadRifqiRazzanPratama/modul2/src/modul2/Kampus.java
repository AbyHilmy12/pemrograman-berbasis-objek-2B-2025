/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author latitude3435
 */
public class Kampus {
    private String nama;
    private String alamat;
    private static int totalMahasiswa = 0;

    public Kampus(String nama, String alamat) {
        if (!validasiNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid! Tidak boleh mengandung angka.");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("===== Info Kampus =====");
        System.out.println("Nama Kampus : " + nama);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println();
    }

    public static void tambahMahasiswa() {
        totalMahasiswa++;
    }

    public static boolean validasiNamaKampus(String nama) {
        for (int i = 0; i < nama.length(); i++) {
            if (nama.charAt(i) >= '0' && nama.charAt(i) <= '9') {
                return false;
            }
        }
        return true;
    }
}
