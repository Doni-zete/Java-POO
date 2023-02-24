package org.example;

public class TesteReferencias {

    public static  void main(String[]args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo =300;

        System.out.println("Saldo da primeria: " +primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

    }
}
