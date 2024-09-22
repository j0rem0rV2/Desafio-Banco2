package com.banking.banking.account;
import com.banking.banking.client.Client;
import lombok.Data;

@Data

public class CheckingAccount extends GAccount{
    public CheckingAccount(double balance, int accountNumber, Client name) {
        super(balance, accountNumber, name);
    }


}
