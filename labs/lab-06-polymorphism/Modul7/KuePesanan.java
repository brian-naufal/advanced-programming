package Modul7;

public class KuePesanan extends Kue {
    protected double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return berat * harga;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s\nHarga: %.2f\nBerat: %.2f\n", nama, harga, berat);
    }
}
