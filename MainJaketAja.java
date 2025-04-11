// Ini file utamanyauntuk soal nomor 2 dan 3
// [OOP: Membuat objek JaketLabkomdas untuk mengakses method hitung harga total jaket]

import java.util.Scanner;

public class MainJaketAja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //memanggil JaketlabKomdas
        JaketLabKomdas jaket = new JaketLabKomdas();

        System.out.print("Jumlah jaket A: ");
        int a = input.nextInt();
        System.out.print("Jumlah jaket B: ");
        int b = input.nextInt();
        System.out.print("Jumlah jaket C: ");
        int c = input.nextInt();

        int totalA = jaket.hitungTotalA(a);
        int totalB = jaket.hitungTotalB(b);
        int totalC = jaket.hitungTotalC(c);

        int total = totalA + totalB + totalC;

        System.out.println("Total harga jaket A: " + totalA);
        System.out.println("Total harga jaket B: " + totalB);
        System.out.println("Total harga jaket C: " + totalC);
        System.out.println("Total keseluruhan: " + total);
    }
}
