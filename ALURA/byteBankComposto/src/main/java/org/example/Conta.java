package org.example;

public class Conta {
    double saldo;
    int agencia ;
    int numero;
    Cliente titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    //getter e setter faz
    public double getSaldo( ){
        return this.saldo;
    }

}
