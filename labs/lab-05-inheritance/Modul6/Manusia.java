package Modul6;

public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        int tun = 0;
        if (menikah == true) {
            if (jenisKelamin == true) {
                tun = 25;
            } else {
                tun = 20;
            }
        } else {
            tun = 15;
        }
        return tun;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format(
                "Nama : %s\nNIK : %s\nJenis Kelamin : %s\nPendapatan : %.1f\n",
                nama, nik,
                jenisKelamin ? "Laki-laki" : "Perempuan",
                getPendapatan());
    }
}
