package Library2;

import java.util.ArrayList;
import java.util.List;

class Perpus {
    private String nama;
    private List<Kategori> kategoriList = new ArrayList<>();

    public Perpus(String nama) {
        this.nama = nama;
    }

    public void tambahKategori(Kategori k) {
        kategoriList.add(k);
    }

    public void display() {
        System.out.println("Perpustakaan: " + nama + "\n");
        for (Kategori k : kategoriList) {
            k.display();
        }
    }
}