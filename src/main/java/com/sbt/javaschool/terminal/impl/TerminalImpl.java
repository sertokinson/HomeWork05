package com.sbt.javaschool.terminal.impl;

import com.sbt.javaschool.terminal.api.Terminal;

import javax.security.auth.login.AccountLockedException;
import java.io.IOException;
import java.util.Scanner;

public class TerminalImpl implements Terminal {
    private final TerminalServer server;
    private final PinValidator pinValidator;
    double account=10000;
    final int pin=7273;

    public TerminalImpl()  {
        int count=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите пин:");
        int newPin = scanner.nextInt();
        long unlock;
        try {
            while (new PinValidator(newPin,count).pin==-1){
                count++;
                System.err.println("Осталось попыток: "+ (4-count)+". Введите пин:");
                newPin = scanner.nextInt();

            }
        } catch (AccountLockedException e) {
            unlock=System.currentTimeMillis();
            boolean scan;
            while((System.currentTimeMillis()-unlock)/1000<=5) {
                System.err.println("Аккаунт будет разблокирован через: " + (5 - (System.currentTimeMillis() - unlock) / 1000) + " секунд");
                scanner.next();
            }
            new TerminalImpl();
        }
        server=new TerminalServer(account,pin);
        pinValidator=null;
    }



    public void getAccount() {
        try {
            server.getAccount();
        } catch (NullPointerException e) {
        }

    }


    public void getMoney(double money) {
        try {
            server.getMoneyExc(money);
        } catch (IOException e){
            System.err.println("Error: Можно снять сумму только кратную 100");
        } catch (Exception e) {
            System.err.println("Error: Недостаточно средств");
        }

    }

    public void putMoney(double money) {
        try {
            server.setMoneyExc(money);
        } catch (NullPointerException e){
        } catch (Exception e) {
            System.err.println("Error: Можно положить сумму только кратную 100");
        }

    }




}
