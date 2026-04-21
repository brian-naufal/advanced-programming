package Modul6;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah,
            double gaji, int jumlahAnak, LocalDate tahunMasuk, String departemen) {
        super(nama, nik, jenisKelamin, menikah, gaji, jumlahAnak, tahunMasuk);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (getGaji() * 0.10);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Departemen : %s\n", departemen);
    }
}