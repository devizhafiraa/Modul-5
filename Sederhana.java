// File ini menjawab soal nomor 1 juga: menyederhanakan pecahan

public class Sederhana {

    // Method non-static untuk menyederhanakan pecahan
    public void sederhana(int pembilang, int penyebut) {
        // Cari FPB antara pembilang dan penyebut
        int fpb = cariFPB(pembilang, penyebut);
        // Bagi pembilang dan penyebut dengan FPB untuk menyederhanakan pecahan
        int pembilangBaru = pembilang / fpb;
        int penyebutBaru = penyebut / fpb;
        // Tampilkan hasil penyederhanaan
        System.out.println("Pecahan sederhana: " + pembilangBaru + "/" + penyebutBaru);
    }

    // Method bantu untuk mencari FPB dengan algoritma Euclidean
    private int cariFPB(int a, int b) {
        // Looping sampai b = 0, FPB adalah nilai a terakhir
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}