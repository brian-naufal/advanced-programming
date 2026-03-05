package Library;

import java.util.List;

class Buku {
    private String judul;
    private int tahun;
    private List<Penulis> penulis;

    public Buku(String judul, int tahun, List<Penulis> penulis) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
    }

    public void display() {
        System.out.println("Judul: " + judul);
        System.out.println("Tahun: " + tahun);
        System.out.print("Penulis: ");
        for (Penulis p : penulis) {
            System.out.print(p.getNama() + " ");
        }
        System.out.println("\n");
    }
}
