// File ini menjawab soal nomor 2 dan 3: perhitungan total harga jaket dengan final dan diskon
// [ OOP: Class JaketLabkomdas berisi properti dan method yang merepresentasikan objek jaket]

public class JaketLabKomdas {

    // [ Final artinya harga-harga ini tidak bisa diubah lagi]
    public final int HARGA_A = 100000;
    public final int HARGA_B = 125000;
    public final int HARGA_C = 175000;

    // [ Diskon Jaket - Jawaban Nomor 3]
    public int hitungTotalA(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 95000;
        } else {
            return jumlah * HARGA_A;
        }
    }

    // [ Diskon Jaket - Jawaban Nomor 3]
    public int hitungTotalB(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 120000;
        } else {
            return jumlah * HARGA_B;
        }
    }

    // [ Diskon Jaket - Jawaban Nomor 3]
    public int hitungTotalC(int jumlah) {
        if (jumlah > 100) {
            return jumlah * 160000;
        } else {
            return jumlah * HARGA_C;
        }
    }
}