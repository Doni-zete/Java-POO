package org.example;

//herda atributos e metodos menos os contrutores

//new Contacorrente
public class ContaCorrente  extends Conta{

    //construtor padrão da classe mãe
    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);
    }

    //sobrescrever o metodo anotação
    @Override
    public boolean sacar(double valor) {
        double valorAsacar = valor + 0.2;
        return super.sacar(valorAsacar);
    }
}
