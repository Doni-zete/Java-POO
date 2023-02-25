package org.example;

public class Conta {
    private double saldo;
    private int agencia ;
    private int numero;
    private Cliente titular;

//    public static int getTotal() {
//        System.out.println(this.saldo);
//        return Conta.total;
//    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

    //static que dizer da classe
    private static int total;

//    public Conta(){}

    //Rotina de inicialização contrutor pode receber parametros
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas eh " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Numero da agencia: "+ this.agencia);
        System.out.println("Estou criando uma conta "+ this.numero);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    //getter e setter faz
    public double getSaldo(){
        return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        if(numero<=0){
            System.out.println("Nao pode valor menor ou igual a zero");
            return;
        }

        this.numero = numero;
    }
    public int getAgencia() {
        return  this.agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia <=0){
            System.out.println("Não pode valor menor iguala 0");
            return;
        }
        this.agencia = agencia;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;

    }

    public static int getTotal() {
        return total;
    }
}
