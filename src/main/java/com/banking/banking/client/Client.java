package com.banking.banking.client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private String name;
    private int cpf;

    @Override
    public String toString() {
        return name + " (CPF: " + cpf + ")";
    }
}
