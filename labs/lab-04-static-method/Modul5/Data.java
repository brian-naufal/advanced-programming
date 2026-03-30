package Modul5;

public class Data {
    private static final int priceA = 100000;
    private static final int priceB = 125000;
    private static final int priceC = 175000;
    private static int cart = 0;
    private static int cost = 0;

    public static void addCart(int n) {
        cart = n;
    }

    public static void buy(String s) {
        if (cart > 100) {
            if (s.equals("A")) {
                cost += (cart * 95000);
            } else if (s.equals("B")) {
                cost += (cart * 120000);
            } else if (s.equals("C")) {
                cost += (cart * 160000);
            }
        } else {
            if (s.equals("A")) {
                cost += (cart * priceA);
            } else if (s.equals("B")) {
                cost += (cart * priceB);
            } else if (s.equals("C")) {
                cost += (cart * priceC);
            }
        }
    }

    public static void display() {
        System.out.println("Total cost = " + cost);
    }
}