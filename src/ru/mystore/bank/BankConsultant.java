package ru.mystore.bank;

import ru.mystore.staff.Stuff;

public class BankConsultant extends Stuff{
    public BankConsultant(String fullName) {
        super(fullName);
    }

    private Bank sberbank = new Bank("Sberbank");
    private Bank vtb24 = new Bank("VTB24");
    private Bank uralsib = new Bank("Uralsib");

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
