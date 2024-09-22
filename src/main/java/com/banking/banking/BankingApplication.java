package com.banking.banking;

import com.banking.banking.account.CheckingAccount;
import com.banking.banking.account.GAccount;
import com.banking.banking.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);


		Client luiz = new Client("Luiz", 1234456);


		CheckingAccount conta1 = new CheckingAccount(500, 2833, luiz);


		conta1.imprimirConta();

		GAccount conta2 = new GAccount(0, 0, null);
		conta2.createAccount();
		conta2.imprimirConta();

		GAccount conta3 = new GAccount(0, 0, null);
		conta3.createAccount();
		conta3.imprimirConta();


		conta1.imprimirConta();
		conta2.imprimirConta();
		conta3.imprimirConta();
}
}
