package Modul6;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Manusia m1 = new Manusia("Brian", "11111111", true, true);
        System.out.println(m1);

        Manusia m2 = new Manusia("Wonyoung", "22222222", false, true);
        System.out.println(m2);

        Manusia m3 = new Manusia("Aseli", "33333333", true, false);
        System.out.println(m3);

        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Brian", "11111111", true, false, "255150700111042", 2);
        System.out.println(mhs1);

        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Wonyoung", "22222222", false, true, "215150300111042", 3.5);
        System.out.println(mhs2);

        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Aseli", "33333333", true, false, "205150600111042", 4);
        System.out.println(mhs3);

        Pekerja p1 = new Pekerja("Brian", "11111111", true, true, 2000, 2, LocalDate.of(2024, 1, 1));
        System.out.println(p1);

        Pekerja p2 = new Pekerja("Wonyoung", "22222222", false, true, 2000, 2, LocalDate.of(2017, 1, 1));
        System.out.println(p2);

        Pekerja p3 = new Pekerja("Aseli", "33333333", true, false, 2000, 0, LocalDate.of(2001, 1, 1));
        System.out.println(p3);

        Manager mng1 = new Manager("Brian", "11111111", true, true, 7500, 10, LocalDate.of(2011, 1, 1),
                "Teknik Informatika");
        System.out.println(mng1);
    }
}