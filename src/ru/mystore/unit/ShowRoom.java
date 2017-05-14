package ru.mystore.unit;

public class ShowRoom {
    private String name;
    private String address;
    private int square;

    public ShowRoom(String name, String address, int square) {
        this.name = name;
        this.address = address;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void giveDisount(){

    }

    public void changeAmountOfDiscount(){

    }

}
