package org.example;

public class TesteSacarNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(200);
        System.out.println( conta.sacar(100));


        conta.sacar(101);

        System.out.println(conta.getSaldo());

    }
}
