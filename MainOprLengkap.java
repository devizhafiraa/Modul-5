
// file utama untuk menjalankan semua operasi di soal nomor 1

import java.util.Scanner;

public class MainOprLengkap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input nilai untuk operasi tambah dan kurang
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        // memanggil method static dari class TambahKurang
        System.out.println("Hasil penjumlahan: " + TambahKurang.tambah(a, b));
        System.out.println("Hasil pengurangan: " + TambahKurang.kurang(a, b));

        // mmbuat objek dari class untuk akses method non-static
        KaliBagi kaliBagi = new KaliBagi();
        Sederhana sederhana = new Sederhana();

        // untuk memanggil method perkalian dan pembagian
        System.out.println("Hasil perkalian: " + kaliBagi.kali(a, b));
        System.out.println("Hasil pembagian: " + kaliBagi.bagi(a, b));

        //menginput nilai untuk penyederhanaan pecahan
        System.out.print("Masukkan pembilang: ");
        int pembilang = input.nextInt();
        System.out.print("Masukkan penyebut: ");
        int penyebut = input.nextInt();

        // memanggil method sederhana
        sederhana.sederhana(pembilang, penyebut);
    }
}

