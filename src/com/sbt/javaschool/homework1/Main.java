package com.sbt.javaschool.homework1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Terminal terminal = new TerminalImpl();
        terminal.getAccount();
        terminal.getMoney(10);
        terminal.getAccount();
        terminal.setMoney(10000);
        terminal.getAccount();
    }
}
