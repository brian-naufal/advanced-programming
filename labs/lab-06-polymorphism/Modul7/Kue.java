package Modul7;

public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String s, double n) {
        nama = s;
        harga = n;
    }

    public abstract double hitungHarga();

    public String toString() {
        return String.format("Nama: %s\nHarga: %.2f\n", nama, harga);
    }
}
