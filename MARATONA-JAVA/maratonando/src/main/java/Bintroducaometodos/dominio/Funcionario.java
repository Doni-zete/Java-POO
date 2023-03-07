package Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario : salarios) {
            System.out.println("Salario: " + salario);

        }
    }

    public void imprimirMedias() {
        double media = 0;
        if (salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("Medias salarios: " + media);

    }
}
