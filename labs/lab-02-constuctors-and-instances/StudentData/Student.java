package StudentData;
public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private int jumlahObjek;

    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    public Student(double mathgrade, double englishgrade, double sciencegrade) {
        this.mathGrade = mathgrade;
        this.englishGrade = englishgrade;
        this.scienceGrade = sciencegrade;
        jumlahObjek++;
    }

    public void setName(String n) {

        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir(double n) {
        if (n >= 60) {
            return true;
        } else {
            return false;
        }
    }

    private void jumlahObjek() {
        System.out.println("Jumlah objek yang dibuat: " + jumlahObjek);
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.printf("dengan status akhir %s\n", statusAkhir(getAverage()) ? "Lulus" : "Tidak Lulus");
    }
}