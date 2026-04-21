package Modul6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private int jumlahAnak;
    private LocalDate tahunMasuk;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah,
            double gaji, int jumlahAnak, LocalDate tahunMasuk) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        this.tahunMasuk = tahunMasuk;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public double getGaji() {
        return gaji;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getLamaBekerja() {
        return LocalDate.now().getYear() - tahunMasuk.getYear();
    }

    public double getBonus() {
        int lama = getLamaBekerja();
        double bonus;
        if (lama <= 5)
            bonus = gaji * 0.05;
        else if (lama <= 10)
            bonus = gaji * 0.10;
        else
            bonus = gaji * 0.15;

        bonus += jumlahAnak * 20;
        return bonus;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "Tahun Masuk : %d %d %d\nJumlah Anak : %d\nGaji : %.1f\n",
                tahunMasuk.getDayOfMonth(), tahunMasuk.getMonthValue(), tahunMasuk.getYear(),
                jumlahAnak, gaji);
    }
}