package com.sbt.javaschool.terminal.impl;

import javax.security.auth.login.AccountLockedException;

public class PinValidator extends TerminalServer {
    boolean validator=true;
    public PinValidator(int pin, int countAttempt) throws AccountLockedException {
        try {
            serverPinValidator(pin);
        } catch (Exception e) {
            System.err.println("Error: Некорректный пин!");
            validator = false;
        }
        if (countAttempt == 3) {
            throw new AccountLockedException();
        }

    }
}
