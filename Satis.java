import java.util.ArrayList;
import java.util.List;

class Sale {
    private List<Product> productList;
    private String paymentMethod;

    public Sale(List<Product> products, String paymentMethod) {
        this.productList = products;
        this.paymentMethod = paymentMethod;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : productList) {
            total += product.getTotalPrice(); // Her ürünün toplam tutarını ekle
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("=== RECEIPT ===");
        for (Product product : productList) {
            System.out.println("Product: " + product.getName());
            System.out.println("Price per kg: $" + product.getPricePerKg());
            System.out.println("Quantity: " + product.getKg() + " kg");
            System.out.println("Subtotal: $" + product.getTotalPrice());
            System.out.println("---------------------");
        }
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Total: $" + calculateTotal());
        System.out.println("=================");
    }
}
