package com.sbt.javaschool.terminal.api;

import javax.security.auth.login.AccountLockedException;
import java.io.IOException;

public interface Terminal {

    /**
     * Access to the terminal is provided only after the correct input of the pin.
     * getAccount() allows receive account balance
     *
     * @throws AccountLockedException if enter 3 incorrect pins, the account is lost for 5 seconds
     */
    void getAccount();

    /**
     * Withdraw money
     *
     * @param money
     * @throws IOException if the sum is not a multiple of 100
     * @throws Exception   if insufficient funds
     */
    void getMoney(double money);

    /**
     * To put money into the account
     *
     * @param money
     * @throws IOException if the sum is not a multiple of 100
     */
    void putMoney(double money);
}
