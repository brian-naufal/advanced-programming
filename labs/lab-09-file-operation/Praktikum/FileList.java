package Praktikum;

import java.io.File;

public class FileList {

    public static void main(String[] args) {

        File folder = new File("Praktikum");

        if (folder.exists() && folder.isDirectory()) {

            File[] daftarFile = folder.listFiles();

            for (File file : daftarFile) {
                System.out.println(file.getName());
            }

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
