package org.example;

public class Contapoupança extends Conta {
    public Contapoupança(int agencia, int numero) {
        super(agencia, numero);

    }

    @Override
    public void depositar(double valor) {
        super.saldo +=valor;
    }
}
