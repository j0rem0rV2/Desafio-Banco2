package com.banking.banking.account;
import com.banking.banking.client.Client;
import lombok.Data;

@Data

public class SavingAccount extends GAccount{
    public SavingAccount(double balance, int accountNumber, Client name) {
        super(balance, accountNumber, name);

    }
}
