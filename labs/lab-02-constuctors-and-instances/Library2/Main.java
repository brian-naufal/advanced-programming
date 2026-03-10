package Library2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sinopsis1 = "satu dua tiga empat lima enam tujuh delapan sembilan sepuluh.";
        String sinopsis2 = "sebelas dua belas tiga belas empat belas lima belas enam belas tujuh belas delapan belas sembilan belas dua puluh.";

        Buku buku1 = new Buku("Pemrograman Java", 2024, Arrays.asList(new Penulis("James")), sinopsis1);
        Buku buku2 = buku1.copy();
        Buku buku3 = new Buku("Pemrograman Java", 2020, Arrays.asList(new Penulis("Budi")), sinopsis1);
        Buku buku4 = new Buku("Database", 2024, Arrays.asList(new Penulis("James")), sinopsis2);
        Buku buku5 = new Buku("Chainsaw", 2024, Arrays.asList(new Penulis("Siti")), "Cainsaw gergaji mesin utk memotong kayu besar dengan cepat sekali.");

        System.out.println("--- Analisis Kesamaan ---");
        System.out.println("Buku 1 & Buku 2       : " + buku1.cekKesamaan(buku2) + "%");
        System.out.println("Buku 1 & Buku 3       : " + buku1.cekKesamaan(buku3) + "%");
        System.out.println("Buku 2 & Buku 4       : " + buku2.cekKesamaan(buku4) + "%");
        System.out.println("Buku 1 & Buku 5       : " + buku1.cekKesamaan(buku5) + "%");
        System.out.println("-------------------------\n");

        Kategori teknologi = new Kategori("Teknologi");
        teknologi.tambahBuku(buku1);
        teknologi.tambahBuku(buku4);

        Perpus perpus = new Perpus("UB");
        perpus.tambahKategori(teknologi);
        perpus.display();
    }
}