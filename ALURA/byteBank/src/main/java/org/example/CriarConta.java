package org.example;

public class CriarConta {
    public static void main(String[] args) {
       Conta primeiraConta =  new Conta();

       primeiraConta.titular = "Donizete";

       primeiraConta.numero = 2023;
       primeiraConta.saldo = 4500;

       primeiraConta.saldo +=100;

        Conta segundaConta = new Conta();
        segundaConta.titular = "Maria";
        segundaConta.agencia = 5;
        segundaConta.numero = 2022;
        segundaConta.saldo = 2500;

        segundaConta.saldo +=500;

        System.out.println("Saldo: "+primeiraConta.saldo);
        System.out.println("Agencia:"+primeiraConta.agencia);

        System.out.println("Saldo: "+ segundaConta.saldo);
        System.out.println("Agencia:" + segundaConta.agencia);
    }
}