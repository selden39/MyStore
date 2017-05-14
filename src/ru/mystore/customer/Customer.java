package ru.mystore.customer;

public class Customer {
    private String name;
    private boolean storeCard = false;

   public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStoreCard(boolean storeCard) {
        this.storeCard = storeCard;
    }

    public void requestCredit (){

    }

    public void seeProduct (){
        String likeProduct = null;
        buyProduct(likeProduct);
    }

    private String buyProduct(String codeProduct){
        String codeProuct = codeProduct;
        return codeProuct;
    }

}
