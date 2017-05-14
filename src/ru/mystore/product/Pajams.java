package ru.mystore.product;

public class Pajams {
    private String codeProduct;
    private String brand;
    private String model;
    private String size;
    private double cost;
    private int amountInShowroom;
    private int amountInStore;

    public Pajams(String codeProduct, String brand, String model, String size, double cost, int amountInShowroom, int amountInStore) {
        this.codeProduct = codeProduct;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.cost = cost;
        this.amountInShowroom = amountInShowroom;
        this.amountInStore = amountInStore;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountInShowroom() {
        return amountInShowroom;
    }

    public void setAmountInShowroom(int amountInShowroom) {
        this.amountInShowroom = amountInShowroom;
    }

    public int getAmountInStore() {
        return amountInStore;
    }

    public void setAmountInStore(int amountInStore) {
        this.amountInStore = amountInStore;
    }
}
