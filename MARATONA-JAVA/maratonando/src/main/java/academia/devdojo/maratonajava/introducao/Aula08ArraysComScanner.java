package academia.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula08ArraysComScanner {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes: ");
            nomes = new String[]{leitor.next()};

            System.out.println(nomes[i]);
        }
    }
}

//        for (int num : numero3){
//            System.out.println(num);
//        }
//              {
//
//        }


