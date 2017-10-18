package com.sbt.javaschool.terminal.impl;

import java.io.IOException;

public class TerminalServer {
    private double account = 10000;
    private final static int pin = 7273;

    public void getMoney(double money) throws Exception {
        if (account - money < 0)
            throw new Exception("Недостаточно средств");
        else if (money % 100 == 0)
            this.account -= money;
        else throw new IOException("Нельзя снять сумму не кратную 100");
    }

    public void setMoney(double money) throws Exception {
        if (money % 100 == 0)
            this.account += money;
        else throw new Exception("Нельзя положить сумму не кратную 100");
    }

    public void getAccount() {
        System.out.println(this.account);
    }

    public static void serverPinValidator(int newPin) throws Exception {
        if (pin != newPin)
            throw new Exception("Некорректный пин!");

    }


}
