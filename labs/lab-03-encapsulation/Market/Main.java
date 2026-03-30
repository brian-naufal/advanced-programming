package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pelanggan user1 = new Pelanggan("3812345678", "Brian", 12345678, 1500000);

        int cnt = 1;
        while (cnt != 0) {
            user1.cekFail();

            System.out.println("\n=== MENU ===");
            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int opt = sc.nextInt();
            System.out.println();

            switch (opt) {
                case 1:
                    System.out.print("Masukkan nomor pelanggan: ");
                    String no1 = sc.next();
                    if (no1.equals(user1.getNo())) {
                        System.out.print("Masukkan PIN: ");
                        int p1 = sc.nextInt();
                        if (p1 == user1.getPin()) {
                            System.out.print("Masukkan nominal belanja: ");
                            double n = sc.nextDouble();
                            
                            if (user1.buy(n)) {
                                System.out.println("Transaksi berhasil");
                            } else {
                                System.out.println("Transaksi gagal: Sisa saldo kurang dari Rp10.000");
                            }
                        } else {
                            System.out.println("PIN tidak valid");
                            user1.addFail();
                        }
                    } else {
                        System.out.println("Nomor pelanggan tidak valid");
                        user1.addFail();
                    }
                        System.out.println("Saldo: Rp" + user1.getSaldo());
                    break;

                case 2:
                    System.out.print("Masukkan nomor pelanggan: ");
                    String no2 = sc.next();
                    if (no2.equals(user1.getNo())) {
                        System.out.print("Masukkan PIN: ");
                        int p2 = sc.nextInt();
                        if (p2 == user1.getPin()) {
                            System.out.print("Masukkan jumlah Top Up: ");
                            double n = sc.nextDouble();
                            user1.topUp(n);
                            System.out.println("Top Up berhasil");
                        } else {
                            System.out.println("PIN tidak valid");
                            user1.addFail();
                        }
                    } else {
                        System.out.println("Nomor pelanggan tidak valid");
                        user1.addFail();
                    }
                    System.out.println("Saldo: Rp" + user1.getSaldo());
                    break;

                case 0:
                    cnt = 0;
                    System.out.println("Terima kasih telah berbelanja");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak ada di menu");
            }
        }
    }
}