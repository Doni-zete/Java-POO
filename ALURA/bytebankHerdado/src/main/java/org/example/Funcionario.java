package org.example;

//abstract relacionado com herança
//não pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {
//pivate só visivel nessa classe

    private String nome;
    private String cpf;

    //    protected publico para o filhos as outras classes não
    private double salario;

//    metodo sem corpo, não há implementação
    public  abstract double getBonificacao();

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
