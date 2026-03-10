package Library3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku bukuAktif = new Buku("Ayam", 2067, Arrays.asList(new Penulis("James")), "Satu dua tiga empat lima enam tujuh delapan sembilan sepuluh.");

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Hitung Royalti 10%");
            System.out.println("2. Hitung Royalti %");
            System.out.println("3. Tampilkan Detail Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pil = sc.nextInt();

            if (pil == 1) {
                System.out.print("Masukkan harga buku: ");
                double h = sc.nextDouble();
                System.out.println("Royalti (10%): Rp" + bukuAktif.hitungRoyalti(h));
            } else if (pil == 2) {
                System.out.print("Masukkan harga buku: ");
                double h = sc.nextDouble();
                System.out.print("Masukkan persentase royalti: ");
                double p = sc.nextDouble();
                System.out.println("Royalti (" + p + "%): Rp" + bukuAktif.hitungRoyalti(h, p));
            } else if (pil == 3) {
                bukuAktif.display();
            } else if (pil == 4) {
                System.out.println("Keluar");
                break;
            } else {
                System.out.println("Tidak valid");
            }
        }
        sc.close();
    }
}