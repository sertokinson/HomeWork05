package com.sbt.javaschool.homework1;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

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
