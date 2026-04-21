package latihaninterface;

public class Tumbuhan implements MakhlukHidup{
    String jenis;
    String warna;
    int umur;

    public Tumbuhan(String jenis, String warna, int umur){
        this.jenis = jenis;
        this.warna = warna;
        this.umur = umur;
    }

    @Override
    public void makan(){
        System.out.println("Melakukan fotosintesis");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Tidak bisa berjalan");
    }

    @Override
    public void bersuara(){
        System.out.println("Tidak bersuara");
    }

    public void tampilkanWarna(){
        System.out.println("Warna tumbuhan: " + this.warna);
    }

    public void tampilkanJenis(){
        System.out.println("Jenis tumbuhan: " + this.jenis);
    }
    
    public void tampilkanUmur(){
        System.out.println("Umur tumhuhan: " + this.umur + "Tahun");
    }
}
