package org.example;

//herda atributos e metodos menos os contrutores

//new Contacorrente
public class ContaCorrente extends Conta {

    //construtor padrão da classe mãe
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    //sobrescrever o metodo anotação
    @Override
    public boolean sacar(double valor) {
        double valorAsacar = valor + 0.2;
        return super.sacar(valorAsacar);
    }
}


//Abstract obriga os filhos a usar a implementar o metodo