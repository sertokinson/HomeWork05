package com.sbt.javaschool.terminal;

import com.sbt.javaschool.terminal.api.Terminal;
import com.sbt.javaschool.terminal.impl.TerminalImpl;

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
