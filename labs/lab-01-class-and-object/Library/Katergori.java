package Library;

import java.util.ArrayList;
import java.util.List;

class Kategori {
    private String nama;
    private List<Buku> daftarBuku = new ArrayList<>();

    public Kategori(String nama) {
        this.nama = nama;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void display() {
        System.out.println("=== Kategori: " + nama + " ===");
        for (Buku b : daftarBuku) {
            b.display();
        }
    }
}