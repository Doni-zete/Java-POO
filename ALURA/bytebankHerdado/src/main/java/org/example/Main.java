package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Doni") ;
        funcionario1.setCpf("12345678910");
        funcionario1.setSalario(2600.00);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getBonificacao());

    }
}