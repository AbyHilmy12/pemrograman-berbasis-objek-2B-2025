/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author latitude3435
 */
public class Main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Trunojoyo", "Jl. Telang No. 123");

        Mahasiswa mhs1 = new Mahasiswa("Ikmal Mumtazi", "2312345678", "Teknik Elektro");
        Mahasiswa mhs2 = new Mahasiswa("Ahmad Hendra", "2311223344", "Agroeteknologi");
        Mahasiswa mhs3 = new Mahasiswa("Aby Hilmy", "2311223344", "Sistem Informasi");
        Mahasiswa mhs4 = new Mahasiswa("Ahmad Zaky alwi", "2311223344", "Teknik Mesin");
        Mahasiswa mhs5 = new Mahasiswa("Ilham Harisandi", "2311223344", "Teknik Mesin");
        Mahasiswa mhs6 = new Mahasiswa("Raihan Aryanova", "2311223344", "Teknik Informatika");

        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah("IF103", "Basis Data", 2);
        MataKuliah mk4 = new MataKuliah("IF104", "Struktur basis data", 2);
        MataKuliah mk5 = new MataKuliah("IF105", "Analisis proses bisnis", 3);
        MataKuliah mk6 = new MataKuliah("IF106", "Algoritma Pemrograman", 2);
        MataKuliah mk7 = new MataKuliah("IF107", "Bahasa Inggris", 3);
        MataKuliah mk8 = new MataKuliah("IF108", "Pemrograman Berbasis Objek", 3);

        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        mhs2.tambahMataKuliah(mk3);

        mhs1.tampilkanBiodata();
        mhs2.tampilkanBiodata();

        Mahasiswa.tampilkanTotalMahasiswa();
        kampus.tampilkanInfo();
    }
}
