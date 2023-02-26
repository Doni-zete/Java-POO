package org.example;

public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente  contacorrente =  new ContaCorrente(123, 54321);
        contacorrente.depositar(100);

        Contapoupança contapoupanca = new Contapoupança(123,54368);
        contapoupanca.depositar(500);

        contacorrente.transferir(10,contapoupanca);

        System.out.println("Saldo conta corrente: "+ contacorrente.getSaldo());
        System.out.println("Saldo conta poupança: "+ contapoupanca.getSaldo());

    }
}
