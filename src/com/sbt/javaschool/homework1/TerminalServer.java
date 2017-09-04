package com.sbt.javaschool.homework1;

import java.io.IOException;

public class TerminalServer {
    double account=10000;
    int pin=7273;

    public TerminalServer(double account,int pin) {
        this.account = account;
        this.pin = pin;
    }

    public TerminalServer() {

    }

    public void getMoneyExc(double money) throws Exception {
        if (account - money < 0)
            throw new Exception("Недостаточно средств");
        else if (money % 100 == 0)
            this.account -= money;
        else throw new IOException("Нельзя снять сумму не кратную 100");
    }
    public void setMoneyExc(double money) throws Exception {
        if(money%100==0)
            this.account+=money;
        else throw new Exception("Нельзя положить сумму не кратную 100");
    }
    public void getAccount(){
        System.out.println(this.account);
    }
    public void serverPinValidator(int pin) throws Exception {
        if(this.pin!=pin)
            throw new Exception("Некорректный пин!");

    }


}
