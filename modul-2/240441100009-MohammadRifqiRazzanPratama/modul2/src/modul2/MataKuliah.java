/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author latitude3435
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!validasiSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid! Hanya boleh 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getInfo() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }

    public static boolean validasiSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}

