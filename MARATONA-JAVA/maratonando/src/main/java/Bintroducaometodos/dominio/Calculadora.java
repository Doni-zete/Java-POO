package Bintroducaometodos.dominio;

public class Calculadora {
    public void somarNumeros(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void subtraiNumeros(double num1, double num2) {
        System.out.println(num1 - num2);

    }

    public void multiplicarNumeros(int num1, double num2) {
        System.out.println(num1 * num2);
    }

    //    Retorna um double
    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

    //    somaVarArgs e um array os 3 ponto tem que vir antes e não pode ter nenhum atributo depois
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println(soma);
    }

}
