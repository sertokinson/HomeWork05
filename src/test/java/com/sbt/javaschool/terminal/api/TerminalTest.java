package com.sbt.javaschool.terminal.api;

import com.sbt.javaschool.terminal.impl.TerminalImpl;
import org.junit.Test;

public class TerminalTest {
    Terminal terminal = new TerminalImpl();
    @Test
    public void getAccount() throws Exception {
        terminal.getAccount();
    }

    @Test
    public void getMoney() throws Exception {
        terminal.getMoney(10);
        terminal.getAccount();
    }

    @Test
    public void setMoney() throws Exception {
        terminal.putMoney(10000);
        terminal.getAccount();
    }

}