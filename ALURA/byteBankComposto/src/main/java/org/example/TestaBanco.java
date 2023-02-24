package org.example;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente doni = new Cliente();
        doni.nome = "Donizete Crisos";
        doni.cpf = "111.111.111-22";
        doni.profissao ="Tapa buraco";

        Conta contaDoDoni = new Conta();
        contaDoDoni.depositar(200);

        contaDoDoni.titular = doni;
        System.out.println(contaDoDoni.titular.nome);
        System.out.println(contaDoDoni.titular);
    }

}
