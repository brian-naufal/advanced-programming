import java.util.Scanner;
public class MainMobil {
   public static void main(String[] args) {
        //instan objek bernama m1
        Scanner sc = new Scanner(System.in);
        Mobil m1 = new Mobil();
        
        System.out.print("\nSet kecepatan yang dapat ditempuh: ");
        m1.setKecepatan(sc.nextInt());
        sc.nextLine();
        System.out.print("Set manufaktur mobil: ");
        m1.setManufaktur(sc.nextLine());
        System.out.print("Set nomor plat mobil: ");
        m1.setNoPlat(sc.nextLine());
        System.out.print("Set warna mobil: ");
        m1.setWarna(sc.nextLine());
        System.out.print("Set waktu tempuh dalam satuan jam: ");
        m1.setWaktu(sc.nextInt());
        m1.hitungJarak();
        System.out.println("----------------");
        m1.displayMessage();

        System.out.println("================");

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();

        System.out.print("Set kecepatan yang dapat ditempuh: ");
        m2.setKecepatan(sc.nextInt());
        sc.nextLine();
        System.out.print("Set manufaktur mobil: ");
        m2.setManufaktur(sc.nextLine());
        System.out.print("Set nomor plat mobil: ");
        m2.setNoPlat(sc.nextLine());
        System.out.print("Set warna mobil: ");
        m2.setWarna(sc.nextLine());
        System.out.print("Set waktu tempuh dalam satuan jam: ");
        m2.setWaktu(sc.nextInt());
        m2.hitungJarak();
        System.out.println("----------------");
        m2.displayMessage();

        System.out.println("================");

        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}

