/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

/**
 *
 * @author latitude3435
 */
// Class Kucing
class Kucing {
    String nama;
    String warna;
    int umur;

    public Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    public void suara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    public void info() {
        System.out.println("Kucing - Nama: " + nama + ", Warna: " + warna + ", Umur: " + umur + " tahun");
    }
}

// Class Burung
class Burung {
    String nama;
    String warna;
    boolean bisaTerbang;

    public Burung(String nama, String warna, boolean bisaTerbang) {
        this.nama = nama;
        this.warna = warna;
        this.bisaTerbang = bisaTerbang;
    }

    public void suara() {
        System.out.println(nama + " berkicau: Cuit-cuit!");
    }

    public void info() {
        System.out.println("Burung - Nama: " + nama + ", Warna: " + warna + ", Bisa terbang: " + bisaTerbang);
    }
}

// Class Ikan
class Ikan {
    String nama;
    String habitat;
    double panjang;

    public Ikan(String nama, String habitat, double panjang) {
        this.nama = nama;
        this.habitat = habitat;
        this.panjang = panjang;
    }

    public void suara() {
        System.out.println(nama + " tidak mengeluarkan suara.");
    }

    public void info() {
        System.out.println("Ikan - Nama: " + nama + ", Habitat: " + habitat + ", Panjang: " + panjang + " cm");
    }
}

// Program utama
public class Hewan {
    public static void main(String[] args) {
        // Buat 3 objek dari class-class berbeda menggunakan loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Hewan ke-" + (i + 1));
            
            if (i == 0) {
                Kucing kucing = new Kucing("Milo", "Hitam", 2);
                kucing.info();
                kucing.suara();
            } else if (i == 1) {
                Burung burung = new Burung("Cici", "Kuning", true);
                burung.info();
                burung.suara();
            } else if (i == 2) {
                Ikan ikan = new Ikan("Nemo", "Laut", 10.5);
                ikan.info();
                ikan.suara();
            }

            System.out.println(); // baris kosong antar hewan
        }
    }
}
