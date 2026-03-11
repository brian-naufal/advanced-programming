package Course;

import java.nio.channels.Pipe.SourceChannel;

public class Data {
    private double saldo;
    private String nama;
    private String pass;
    private int rek;

    public Data(double n, String s, String p, int r) {
        saldo = n;
        nama = s;
        pass = p;
        rek = r;
    }

    public void setSaldo(int i) {
        saldo = i;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setPass(String p) {
        pass = p;
    }

    public String getPass() {
        return pass;
    }

    public void setRek(int i) {
        rek = i;
    }

    public int getRek() {
        return rek;
    }

    public void cekNama() {
        if (nama.trim().length() < 4) {
            System.out.println("Nama tidak valid");
            System.exit(0);
        } else {
            System.out.println("Nama valid");
        }
    }

    public void cekRek() {
        if (rek < 8) {
            System.out.println("Nomor rekening tidak valid");
            System.exit(0);
        } else {
            System.out.println("Nomor rekening valid");
        }
    }

    public boolean cekPass(String p) {
        boolean i = false;
        boolean j = cekPassUpper(p);
        if (pass.trim().length() < 8 && j == false) {
            i = false;
        } else if (pass.length() >= 8 && j == true) {
            i = true;
        }
        return i;
    }

    private static boolean cekPassUpper(String p) {
        boolean i = false;
        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) {
                i = true;
            }
        }
        return i;
    }

    public void addSaldo(int i) {
        saldo += i;
    }

    public void tkSaldo(int i) {
        if (cekSaldo(i) == true) {
            saldo -= i;
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }

    public boolean cekSaldo(int i) {
        return i <= saldo;
    }
}
