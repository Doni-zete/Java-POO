package Fmodificadoresestatico.domain;

//Quando se esta trabalhando com atributos static se usa o
// nome da classe ponto o atributo static
public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - Bloco de incialização é executado quandoa JVM carregar a classe
    //1 - Alocado espaço em memória pra objeto
    //2 - cada atributo de classe é criado e inicalizdo com valores default ou o que for passada
    //3 - Bloco de inicialzação é executado
    //4 - Construtor é executado

    static {
        System.out.println("===========================");
        System.out.println("Dentro do cloco de incialização");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    static {
        System.out.println("===========================");
        System.out.println("Dentro do cloco de incialização2");
    }

    static {
        System.out.println("===========================");
        System.out.println("Dentro do cloco de incialização3");
    }

    {
        System.out.println("===========================");
        System.out.println("Dentro do cloco de incialização não estatico");
        System.out.println("===========================");

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
