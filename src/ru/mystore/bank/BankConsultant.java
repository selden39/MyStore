package ru.mystore.bank;

public class BankConsultant {
    private String fullName;
    private Bank sberbank = new Bank("Sberbank");
    private Bank vtb24 = new Bank("VTB24");
    private Bank uralsib = new Bank("Uralsib");

    public BankConsultant(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void takeInfoForCredit(){
        requestForCredit();
    }

    private void requestForCredit(){
        sberbank.acceptCredit();
        vtb24.acceptCredit();
        uralsib.acceptCredit();
        giveCredit();
    }

    private void giveCredit(){

    }

}
