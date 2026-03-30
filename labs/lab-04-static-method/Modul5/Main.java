package Modul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while (count == 1) {

            System.out.print("Jenis bahan: ");
            String bahan = sc.next().toUpperCase();
            System.out.print("Jumlah: ");
            int n = sc.nextInt();
            System.out.println();
            
            Data.addCart(n);
            Data.buy(bahan);
            Data.display();
            System.out.println();
            System.out.println("Press 0 to leave");
            System.out.println("Press 1 to continue");
            count = sc.nextInt();
            if (count == 0) {
                System.exit(0);
            }
            
        }
    }
}