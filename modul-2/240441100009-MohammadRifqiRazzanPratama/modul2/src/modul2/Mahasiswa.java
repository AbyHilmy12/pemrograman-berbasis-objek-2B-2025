/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author latitude3435
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private MataKuliah[] daftarMataKuliah;
    private int jumlahMataKuliah;
    private static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        if (!validasiNIM(nim)) {
            throw new IllegalArgumentException("NIM tidak valid! Harus diawali '23' dan terdiri dari 10 digit.");
        }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarMataKuliah = new MataKuliah[20]; // maksimal 20
        this.jumlahMataKuliah = 0;
        totalMahasiswa++;
        Kampus.tambahMahasiswa();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        if (jumlahMataKuliah < daftarMataKuliah.length) {
            daftarMataKuliah[jumlahMataKuliah] = mk;
            jumlahMataKuliah++;
        } else {
            System.out.println("Tidak bisa menambahkan mata kuliah lagi. Kapasitas penuh.");
        }
    }

    public void tampilkanBiodata() {
        System.out.println("===== Biodata Mahasiswa =====");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Mata Kuliah yang diambil:");
        if (jumlahMataKuliah == 0) {
            System.out.println("- Belum ada mata kuliah.");
        } else {
            for (int i = 0; i < jumlahMataKuliah; i++) {
                System.out.println("- " + daftarMataKuliah[i].getInfo());
            }
        }
        System.out.println();
    }

    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }

    public static boolean validasiNIM(String nim) {
        if (nim.length() != 10) return false;
        if (!nim.startsWith("23")) return false;
        for (int i = 0; i < nim.length(); i++) {
            if (nim.charAt(i) < '0' || nim.charAt(i) > '9') return false;
        }
        return true;
    }
}


