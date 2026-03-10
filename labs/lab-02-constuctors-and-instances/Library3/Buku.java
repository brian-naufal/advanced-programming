package Library3;

import java.util.List;
import java.util.ArrayList;

class Buku {
    private String judul;
    private int tahun;
    private List<Penulis> penulis;
    private String sinopsis;

    public Buku(String judul, int tahun, List<Penulis> penulis, String sinopsis) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKata() {
        if (sinopsis == null || sinopsis.isEmpty()) return 0;
        return sinopsis.trim().split("\\s+").length;
    }

    public double cekKesamaan(Buku bukuLain) {
        double poin = 0;
        if (this.judul.equalsIgnoreCase(bukuLain.judul)) poin++;
        if (this.tahun == bukuLain.tahun) poin++;
        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) poin++;
        if (this.penulis.size() == bukuLain.penulis.size()) {
            boolean sama = true;
            for (int i = 0; i < penulis.size(); i++) {
                if (!this.penulis.get(i).getNama().equals(bukuLain.penulis.get(i).getNama())) {
                    sama = false;
                    break;
                }
            }
            if (sama) poin++;
        }
        return (poin / 4) * 100;
    }

    public Buku copy() {
        return new Buku(this.judul, this.tahun, new ArrayList<>(this.penulis), this.sinopsis);
    }

    public double hitungRoyalti(double harga) {
        return harga * 0.10;
    }

    public double hitungRoyalti(double harga, double persen) {
        return harga * (persen / 100);
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.print("Penulis: ");
        for (Penulis p : penulis) System.out.print(p.getNama() + " ");
        System.out.println("\nSinopsis: " + sinopsis);
        System.out.println("---------------------------");
    }
}