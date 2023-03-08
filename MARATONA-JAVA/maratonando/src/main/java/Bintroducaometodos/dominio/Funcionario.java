package Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private  double media = 0;

    private double[] salarios;

    public void imprimir() {
        System.out.println("========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario : salarios) {
            System.out.println("Salario: " + salario);

        }
    }

    public void imprimirMedias() {
        if (salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("Medias salarios: " + media);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
