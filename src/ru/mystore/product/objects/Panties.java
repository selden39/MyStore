package ru.mystore.product.objects;

import ru.mystore.product.Products;

public class Panties extends Products{
    public Panties(String codeProduct, String brand, String model, String size, double cost, int amountInShowroom, int amountInStore) {
        super(codeProduct, brand, model, size, cost, amountInShowroom, amountInStore);
    }
}
