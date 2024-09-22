package com.banking.banking.account;
import com.banking.banking.client.Client;
import lombok.Data;
import java.util.Scanner;

@Data

public class GAccount implements AccountOps {
    protected double balance;
    protected final int agency= 1;
    protected int accountNumber;
    public Client name;

    public GAccount(double balance, int accountNumber, Client name) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public GAccount createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        accountNumber = scanner.nextInt();
        System.out.println("Enter balance: ");
        balance = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter the client name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter the client CPF: ");
        int clientCpf = scanner.nextInt();
        name = new Client(clientName, clientCpf);

        System.out.println("Account created successfully.");

        return this;
    }



    public void imprimirConta() {
        System.out.println("Conta: " + this.agency+ this.accountNumber + " Proprietário: " + this.name);
    }
}
