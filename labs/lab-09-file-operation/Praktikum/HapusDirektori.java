package Praktikum;

import java.io.File;

public class HapusDirektori {

    public static void main(String[] args) {

        File folder = new File("Praktikum/FileDelete");

        if (folder.exists() && folder.isDirectory()) {

            File[] daftarFile = folder.listFiles();

            for (File file : daftarFile) {
                file.delete();
            }

            if (folder.delete()) {
                System.out.println("Direktori berhasil dihapus");
            } else {
                System.out.println("Direktori gagal dihapus");
            }

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}