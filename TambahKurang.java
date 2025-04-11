// File ini menjawab soal nomor 1: operasi penjumlahan dan pengurangan dengan static method

public class TambahKurang {

    // Method static untuk melakukan penjumlahan
    // Static digunakan supaya bisa dipanggil langsung tanpa buat objek
    public static int tambah(int a, int b) {
        // Menjumlahkan dua bilangan
        return a + b;
    }

    // Method static untuk melakukan pengurangan
    // Static juga supaya bisa diakses tanpa objek
    public static int kurang(int a, int b) {
        // Mengurangkan dua bilangan
        return a - b;
    }
} 
