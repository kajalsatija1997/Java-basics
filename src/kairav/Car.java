package kairav;

public class Car {
    private int mileage;
    private String colour;
    private String brand;
    private double price;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(int mileage, String colour, String brand, double price) {
        this.mileage = mileage;
        this.colour = colour;
        this.brand = brand;
        this.price = price;
    }

    public Car() {
        mileage=10;
        colour="White";
        price=12345;
    }
}
