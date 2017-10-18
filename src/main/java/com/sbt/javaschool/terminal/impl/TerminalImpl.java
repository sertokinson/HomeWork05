package com.sbt.javaschool.terminal.impl;

import com.sbt.javaschool.terminal.api.Terminal;

import javax.security.auth.login.AccountLockedException;
import java.io.IOException;
import java.util.Scanner;

public class TerminalImpl implements Terminal {
    private final TerminalServer server;

    public TerminalImpl() {
        int countAttempt = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пин:");
        int newPin = scanner.nextInt();
        long unlock;
        try {
            while (!(new PinValidator(newPin, countAttempt).validator)) {
                countAttempt++;
                System.err.println("Осталось попыток: " + (4 - countAttempt) + ". Введите пин:");
                newPin = scanner.nextInt();
            }
        } catch (AccountLockedException e) {
            unlock = System.currentTimeMillis();
            while ((System.currentTimeMillis() - unlock) / 1000 <= 5) {
                System.err.println("Аккаунт будет разблокирован через: " + (5 - (System.currentTimeMillis() - unlock) / 1000) + " секунд");
                scanner.next();
            }
            new TerminalImpl();
        }
        server = new TerminalServer();
    }

    public void getAccount() {
        try {
            server.getAccount();
        } catch (NullPointerException e) {
        }
    }


    public void getMoney(double money) {
        try {
            server.getMoney(money);
        } catch (IOException e) {
            System.err.println("Error: Можно снять сумму только кратную 100");
        } catch (Exception e) {
            System.err.println("Error: Недостаточно средств");
        }

    }

    public void putMoney(double money) {
        try {
            server.setMoney(money);
        } catch (NullPointerException e) {
        } catch (Exception e) {
            System.err.println("Error: Можно положить сумму только кратную 100");
        }

    }


}
