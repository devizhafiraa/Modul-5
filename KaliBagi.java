// File ini menjawab sebagian soal nomor 1: perkalian dan pembagian non-static

public class KaliBagi {

    // Method non-static untuk perkalian, harus akses pakai objek dari class
    public int kali(int a, int b) {
        // Mengalikan dua angka
        return a * b;
    }

    // Method non-static untuk pembagian
    public double bagi(int a, int b) {
        // Pake if-else supaya program nggak error kalau b = 0 (pembagi nggak boleh nol)
        if (b == 0) {
            System.out.println("Pembagi tidak boleh nol!");
            return 0;
        } else {
            // Mengembalikan hasil bagi sebagai double (desimal)
            return (double) a / b;
        }
    }
}
