public class Product {
    private String name;     // Name of the product
    private double price;    // Price of the product
    private int quantity;    // Quantity of the product

    // Constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    // Method to print product details
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}

