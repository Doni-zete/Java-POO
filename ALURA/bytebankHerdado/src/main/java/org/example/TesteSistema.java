package org.example;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemInterno si = new SistemInterno();
        si.autentica(g);
    }
}