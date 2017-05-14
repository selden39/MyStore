package ru.mystore.customer;

public class StoreCard {
    private int numberCard;
    private int amountOfDiscount;
    private int amountBuy;

    public StoreCard(int numberCard, int amountOfDiscount, int amountBuy) {
        this.numberCard = numberCard;
        this.amountOfDiscount = amountOfDiscount;
        this.amountBuy = amountBuy;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public int getAmountOfDiscount() {
        return amountOfDiscount;
    }

    public void setAmountOfDiscount(int amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public int getAmountBuy() {
        return amountBuy;
    }

    public void setAmountBuy(int amountBuy) {
        this.amountBuy = amountBuy;
    }
}
