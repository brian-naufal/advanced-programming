package Praktikum;

import java.io.File;

public class CekSize {

    public static void main(String[] args) {

        try {
            File file = new File("test.txt");
            long bytes = file.length();
            if (bytes < 1024 * 1024) {
                System.out.printf("%.2f KB%n", bytes / 1024.0);
            } else {
                System.out.printf("%.2f MB%n", bytes / (1024.0 * 1024.0));
            }
        } catch (Exception e) {
            System.out.println("Gagal membaca file");
        }
    }
}