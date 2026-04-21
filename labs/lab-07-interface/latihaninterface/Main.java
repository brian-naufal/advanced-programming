package latihaninterface;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MANUSIA");
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.println();
        Manusia mns = new Manusia(nama, umur);
        mns.tampilkanNama();
        mns.tampilkanUmur();
        mns.berjalan();
        mns.bersuara();
        mns.makan();

        System.out.println();
        System.out.println("TUMBUHAN");
        System.out.print("Masukkan jenis tumbuhan: ");
        String jenis = sc.nextLine();
        System.out.print("Masukkan warna tumbuhan: ");
        String warna = sc.nextLine();
        System.out.print("Masukkan umur tumbuhan: ");
        umur = sc.nextInt();
        sc.nextLine();
        System.out.println();
        Tumbuhan tmb = new Tumbuhan(jenis, warna, umur);
        tmb.tampilkanJenis();
        tmb.tampilkanWarna();
        tmb.tampilkanUmur();
        tmb.berjalan();
        tmb.bersuara();
        tmb.makan();

        System.out.println();
        System.out.println("HEWAN");
        Hewan hwn = new Hewan();
        hwn.berjalan();
        hwn.bersuara();
        hwn.makan();
    }
}
