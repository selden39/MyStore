package ru.mystore.bank;

public class Bank {
    private String name = "Sberbank";

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected boolean acceptCredit (){
        boolean result = false;
        return result;
    }
}
