package org.example;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemInterno si = new SistemInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);

    }
}
