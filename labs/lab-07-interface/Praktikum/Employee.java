package Praktikum;

public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;
    
    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    @Override
    public double getPayableAmount() {
        double total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    public double netSalary() {
        return salaryPerMonth - getPayableAmount();
    }
    
    public void displayInfo() {
        System.out.println("\n=== KARYAWAN ===");
        System.out.println("No. Registrasi: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji: Rp" + salaryPerMonth);
        
        System.out.println("\nDetail Belanja:");
        if (invoices.length > 0) {
            for (int i = 0; i < invoices.length; i++) {
                System.out.print((i + 1) + ". ");
                invoices[i].displayInfo();
            }
        } else {
            System.out.println("Tidak ada belanja");
        }
        
        System.out.println("\nTotal Bayar: Rp" + getPayableAmount());
        System.out.println("Gaji Bersih: Rp" + netSalary());
        System.out.println("================");
    }
}