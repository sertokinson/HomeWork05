package com.sbt.javaschool.homework1;

import javax.security.auth.login.AccountLockedException;

public class PinValidator extends TerminalServer{
    public PinValidator(int pin,int count) throws AccountLockedException {
        try {
            serverPinValidator(pin);
        } catch (Exception e) {
            System.err.println("Error: Некорректный пин!");
            this.pin=-1;
        }
        if(count==3){
            throw new AccountLockedException();
        }

    }
}
