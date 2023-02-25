package org.example;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337,24226);
        System.out.println(conta.getAgencia());
        conta.setAgencia(123);

        Conta conta2 = new Conta(1337,24226);
        Conta conta3 = new Conta(1337,25226);

        System.out.println(Conta.getTotal());

        //conta está inconsistente
//        conta.setAgencia(-50);
//        conta.setNumero(-330);

    }
}
