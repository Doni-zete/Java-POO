package org.example;
public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoDoni = new Conta();
        contaDoDoni.titular = "Donizete";

//        Envocando o metodo
        System.out.println(contaDoDoni.titular);
        contaDoDoni.saldo = 100;
        contaDoDoni.depositar(200);

        System.out.println(contaDoDoni.saldo);
        contaDoDoni.sacar(80);
        System.out.println(contaDoDoni.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);

        boolean sucessoTranferencia = contaDaMarcela.transferir(980, contaDoDoni);
        if (sucessoTranferencia) {
            System.out.println("Tranferencia com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoDoni.saldo);

    }
}
