public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        kecepatan = i;    
        rubahKecepatan(i);
    }

    public void setWaktu(double w){
        waktu = w;
        rubahSekon(w);
    }
    
    private void rubahSekon(double w){
        waktu = w*3600;
    }

    private void rubahKecepatan(int i){
        kecepatan = (int)(i * 5.0 / 18.0);
    }

    public void hitungJarak(){
        jarak = kecepatan * waktu;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("dengan waktu tempuh " + (int)waktu + " detik");
        System.out.println("jarak yang dapat ditempuh adalah " + (int)jarak + " meter");
    }
}