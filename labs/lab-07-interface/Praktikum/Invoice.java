package Praktikum;

public class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;
    
    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String getProductName() {
        return productName;
    }
    
    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }
    
    public void displayInfo() {
        System.out.println("Produk: " + productName + " , Qty: " + quantity + 
                         " , Harga: Rp" + pricePerItem + " , Total: Rp" + getPayableAmount());
    }
}