package org.example;
public class Testegerente {
    public static void main(String[] args) {


        Gerente gerente = new Gerente();
        Gerente g1 = new Gerente();

        Autenticavel referencia = new Gerente();;
        g1.setSalario(5000.0);
        g1.setCpf("23655454");
        g1.setNome("Doni");


        g1.setSenha(12345);
        boolean autentica =  g1.autentica(12345);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(autentica);

        System.out.println(g1.getBonificacao());
    }
}
