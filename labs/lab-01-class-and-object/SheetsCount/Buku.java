public class Buku {
    private int jmlLembar;
    private int pageLembar = 2;
    private double pageHari;

    public Buku(int jmlLembar, double pageHari) {
        this.jmlLembar = jmlLembar;
        this.pageHari = pageHari;
    }

    public int hitungTotal() {
        return jmlLembar * pageLembar;
    }

    public double hitungWaktu() {
        return hitungTotal() / pageHari;
    }

    public void display() {
        System.out.println("Total halaman: " + hitungTotal());
        System.out.println("Waktu yang dibutuhkan: " + (int)hitungWaktu() + " hari");
    }
}