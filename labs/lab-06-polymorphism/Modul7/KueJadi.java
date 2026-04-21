package Modul7;

public class KueJadi extends Kue {
    protected double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return jumlah * harga * 2;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s\nHarga: %.2f\nJumlah: %.2f\n", nama, harga, jumlah);
    }
}