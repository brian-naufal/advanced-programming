package Modul7;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];
        daftarKue[0] = new KuePesanan("Kue Lapis", 50000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 5000, 10);
        daftarKue[2] = new KuePesanan("Brownies", 75000, 2.0);
        daftarKue[3] = new KueJadi("Cupcake", 8000, 12);
        daftarKue[4] = new KuePesanan("Bolu Gulung", 60000, 1.0);
        daftarKue[5] = new KueJadi("Kue Sus", 6000, 15);
        daftarKue[6] = new KuePesanan("Black Forest", 100000, 2.5);
        daftarKue[7] = new KueJadi("Kroket", 3000, 20);
        daftarKue[8] = new KuePesanan("Tiramisu", 120000, 1.8);
        daftarKue[9] = new KueJadi("Risoles", 4000, 18);
        daftarKue[10] = new KuePesanan("Red Velvet", 110000, 2.2);
        daftarKue[11] = new KueJadi("Nastar", 7000, 25);
        daftarKue[12] = new KuePesanan("Cheese Cake", 95000, 1.5);
        daftarKue[13] = new KueJadi("Kastengel", 9000, 20);
        daftarKue[14] = new KuePesanan("Kue Tart", 150000, 3.0);
        daftarKue[15] = new KueJadi("Kue Lumpur", 5500, 16);
        daftarKue[16] = new KuePesanan("Pandan Cake", 65000, 1.2);
        daftarKue[17] = new KueJadi("Putri Salju", 6500, 22);
        daftarKue[18] = new KuePesanan("Lapis Legit", 200000, 2.0);
        daftarKue[19] = new KueJadi("Lemper", 4500, 14);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d. %s\n", (i + 1), daftarKue[i].toString());
        }

        double totalHargaSemuaKue = 0;
        for (int i = 0; i < 20; i++) {
            totalHargaSemuaKue += daftarKue[i].hitungHarga();
        }
        System.out.printf("Total Harga Semua Kue: Rp %.2f\n", totalHargaSemuaKue);

        System.out.println("\nKue pesanan:");
        System.out.println("--------------------------------------------------------------------------------");
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        int jumlahKuePesanan = 0;

        for (int i = 0; i < 20; i++) {
            if (daftarKue[i] instanceof KuePesanan) {
                KuePesanan kuePesanan = (KuePesanan) daftarKue[i];
                totalHargaKuePesanan += kuePesanan.hitungHarga();
                totalBeratKuePesanan += kuePesanan.berat;
                jumlahKuePesanan++;
            }
        }

        System.out.printf("Jumlah Jenis Kue Pesanan: %d\n", jumlahKuePesanan);
        System.out.printf("Total Berat Kue Pesanan: %.2f kg\n", totalBeratKuePesanan);
        System.out.printf("Total Harga Kue Pesanan: Rp %.2f\n", totalHargaKuePesanan);

        System.out.println("\nKue jadi:");
        System.out.println("--------------------------------------------------------------------------------");
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        int jumlahJenisKueJadi = 0;

        for (int i = 0; i < 20; i++) {
            if (daftarKue[i] instanceof KueJadi) {
                KueJadi kueJadi = (KueJadi) daftarKue[i];
                totalHargaKueJadi += kueJadi.hitungHarga();
                totalJumlahKueJadi += kueJadi.jumlah;
                jumlahJenisKueJadi++;
            }
        }

        System.out.printf("Jumlah Jenis Kue Jadi: %d\n", jumlahJenisKueJadi);
        System.out.printf("Total Jumlah Kue Jadi: %.0f buah\n", totalJumlahKueJadi);
        System.out.printf("Total Harga Kue Jadi: Rp %.2f\n", totalHargaKueJadi);

        System.out.println("\nKue harga terbesar:");
        System.out.println("--------------------------------------------------------------------------------");
        Kue kueTermahal = daftarKue[0];
        double hargaTerbesar = daftarKue[0].hitungHarga();

        for (int i = 1; i < 20; i++) {
            if (daftarKue[i].hitungHarga() > hargaTerbesar) {
                hargaTerbesar = daftarKue[i].hitungHarga();
                kueTermahal = daftarKue[i];
            }
        }
        System.out.println(kueTermahal.toString());

    }
}