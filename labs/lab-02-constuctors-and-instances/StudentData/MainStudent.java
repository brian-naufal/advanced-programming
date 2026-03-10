package StudentData;

import java.util.*;
public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student Siswa [] = new Student [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama: ");
            String name = sc.nextLine();
            System.out.print("Masukkan alamat: ");
            String address = sc.nextLine();
            System.out.print("Masukkan umur: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai matematika, bahasa inggris, dan ilmu pengetahuan alam: ");
            double mathGrade = sc.nextDouble();
            double englishGrade = sc.nextDouble();
            double scienceGrade = sc.nextDouble();
            sc.nextLine();

            Siswa[i] = new Student(name, address, age);
            Siswa[i].setMath((int) mathGrade);
            Siswa[i].setEnglish((int) englishGrade);
            Siswa[i].setScience((int) scienceGrade);
            System.out.println("\n");
        }
        for (int i = 0; i < n; i++) {
            Siswa[i].displayMessage();
            System.out.println("===================");
        }

        Student grade = new Student(80, 90, 100);
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();
    }
}
