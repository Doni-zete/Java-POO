package org.example;

public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente donili = new Cliente();
        donili.setNome("Donizete Cris");

        conta.setTitular(donili);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Vagabundo");
        // emduas linhas
        Cliente titularDaConta = conta.getTitular();
       titularDaConta.setProfissao("vagabundo");

        System.out.println(donili);
        System.out.println(titularDaConta);
        System.out.println(conta.getTitular());



    }
}
