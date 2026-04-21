package Praktikum;

public class Main {
    public static void main(String[] args) {
        
        Invoice inv1 = new Invoice("Beras 5kg", 2, 65000);
        Invoice inv2 = new Invoice("Minyak Goreng", 3, 35000);
        Invoice inv3 = new Invoice("Gula", 5, 15000);
        
        Invoice[] belanjaKaryawan1 = {inv1, inv2, inv3};
        Employee emp1 = new Employee(1001, "Yena", 5000000, belanjaKaryawan1);
        
        Invoice[] belanjaKaryawan2 = {
            new Invoice("Susu", 4, 18000),
            new Invoice("Roti", 3, 12000)
        };
        Employee emp2 = new Employee(1002, "Yunah", 4500000, belanjaKaryawan2);
        
        Invoice[] belanjaKaryawan3 = {};
        Employee emp3 = new Employee(1003, "Riko", 6000000, belanjaKaryawan3);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();

        Payable[] payables = {emp1, emp2, emp3};
        
        for (Payable p : payables) {
            if (p instanceof Employee) {
                Employee e = (Employee) p;
                System.out.println(e.getName() + " - Total Bayar: Rp" + p.getPayableAmount());
            }
        }
    }
}