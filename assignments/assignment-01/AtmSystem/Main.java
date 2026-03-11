package Course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("PENGISIAN DATA USER: \n");
        System.out.print("Masukkan nama user: ");
        String name = sc.nextLine();
        System.out.print("Masukkan nomor rekening user: ");
        int rek = sc.nextInt();
        System.out.print("Masukkan password rekening: ");
        String pass = sc.next();
        System.out.print("Masukkan jumlah pengisian saldo awal: ");
        int n = sc.nextInt();

        Data user1 = new Data(n, name, pass, rek);
        System.out.println();
        user1.cekNama();
        user1.cekRek();
        if (user1.cekPass(user1.getPass()) == false) {
            System.out.println("Password tidak terpenuhi");
            System.exit(i);
        } else {
            System.out.println("Password terpenuhi");
        }

        while (i != 0) {
            System.out.printf("\nMenu: ");
            System.out.printf("\n1. Add saldo");
            System.out.printf("\n2. Take saldo\n");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("\nMasukkan password: ");
                    String p = sc.next();
                    if (p.equals(user1.getPass())) {
                        System.out.print("Masukkan jumlah: ");
                        int na = sc.nextInt();
                        user1.addSaldo(na);
                    } else {
                        System.out.println("Password tidak valid");
                    }
                    System.out.printf("Saldo: %.2f\n", user1.getSaldo());
                    break;
                case 2:
                    System.out.print("\nMasukkan password: ");
                    p = sc.next();
                    if (p.equals(user1.getPass())) {
                        System.out.print("Masukkan jumlah: ");
                        int na = sc.nextInt();
                        user1.tkSaldo(na);
                    } else {
                        System.out.println("Password tidak valid");
                    }
                    System.out.printf("Saldo: %.2f\n", user1.getSaldo());
                    break;
                case 0:
                    i = 0;
                    break;
            }
        }
    }
}
