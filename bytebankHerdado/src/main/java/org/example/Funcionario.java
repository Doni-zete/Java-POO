package org.example;

public class Funcionario {
//pivate só visivel nessa classe

    private String nome;
    private String cpf;

    //    protected publico para o filhos as outras classes não
    private double salario;

    //    metodo calculo aumento de 10% salario
    public double getBonificacao() {
        return this.salario * 0.05;
    }

    //construtor vazio não retorna nada
    public Funcionario() {

    }
    public String getNome() {
        return nome;
    }

    //getter e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
