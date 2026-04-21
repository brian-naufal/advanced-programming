package Modul6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5)
            return 50;
        else if (ipk > 3.5 && ipk <= 4.0)
            return 75;
        return 0;
    }

    public String getStatus() {
        String kodeProdi = nim.substring(6, 7);
        String angkatan = "20" + nim.substring(0, 2);
        String prodi;
        switch (kodeProdi) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak dikenal";
                break;
        }
        return prodi + ", " + angkatan;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "NIM : %s\nIPK : %.2f\nStatus : %s\n",
                nim, ipk, getStatus());
    }
}