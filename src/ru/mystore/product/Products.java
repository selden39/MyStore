package ru.mystore.product;

public class Products {
    private String codeProduct;
    private String brand;
    private String model;
    private String size;
    private double cost;
    private int amountInShowroom;
    private int amountInStore;

    public Products(String codeProduct, String brand, String model, String size, double cost, int amountInShowroom, int amountInStore) {
        this.codeProduct = codeProduct;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.cost = cost;
        this.amountInShowroom = amountInShowroom;
        this.amountInStore = amountInStore;
    }

}
