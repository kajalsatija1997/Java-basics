package Swetha.execptionHandling;

public class Product {
    private int id;
    private String productName;
    private String brand;
    private int itemsAvailable;

    public Product(int id,String productName, String brand, int itemsAvailable) {
        this.id=id;
        this.productName = productName;
        this.brand = brand;
        this.itemsAvailable = itemsAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(int itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", itemsAvailable=" + itemsAvailable +
                '}';
    }
}
