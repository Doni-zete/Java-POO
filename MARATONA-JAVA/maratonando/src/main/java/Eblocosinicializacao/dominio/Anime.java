package Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios ;

    // 0 - Bloco de incialização é execução quandoa JVM carregar classe
    // 1 - Alocado espaço em memória pra objeto
    //2 -cada atributo de classe é criado e inicalizdo com valores default ou o que for passada
    //3- Bloco de inicialzação é executado
    //4 - Construtor é executado
    {
        System.out.println("Dentro do cloco de incialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
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
