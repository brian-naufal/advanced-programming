package Market;

public class Pelanggan {
    private double saldo;
    private String no;
    private String nama;
    private String type;
    private int pin;
    private int fail = 0;

    public Pelanggan(String no, String nama, int pin, double saldoAwal) {
        this.no = no;
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldoAwal;
        cekNo();
    }

    public int getPin() {
        return pin;
    }

    public String getNama() {
        return nama;
    }

    public String getType() {
        return type;
    }

    public String getNo() {
        return no;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addFail() {
        fail++;
    }

    public void cekFail() {
        if (fail >= 3) {
            System.out.println("Akun diblokir!");
            System.exit(0);
        }
    }

    private void cekNo() {
        if (no.startsWith("38")) {
            type = "Silver";
        } else if (no.startsWith("56")) {
            type = "Gold";
        } else if (no.startsWith("74")) {
            type = "Platinum";
        } else {
            type = "Reguler";
        }
    }

    private double hitungCashback(double amount) {
        double cashback = 0;
        if (amount > 1000000) {
            if (type.equals("Silver"))
                cashback = amount * 0.05;
            else if (type.equals("Gold"))
                cashback = amount * 0.07;
            else if (type.equals("Platinum"))
                cashback = amount * 0.10;
        } else {
            if (type.equals("Gold"))
                cashback = amount * 0.02;
            else if (type.equals("Platinum"))
                cashback = amount * 0.05;
        }
        return cashback;
    }

    public boolean buy(double amount) {
        double cashback = hitungCashback(amount);
        double totalPotong = amount - cashback;

        if (saldo - totalPotong < 10000) {
            return false;
        } else {
            saldo -= totalPotong;
            System.out.println("Mendapat Cashback: Rp" + cashback);
            return true;
        }
    }

    public void topUp(double amount) {
        saldo += amount;
    }
}