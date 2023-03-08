package Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    private String estudio;


    //construtor não tem nenhum tipo de retorno
    //o java gera um construtor
    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
//        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

//Chamar construtores com a palavras this
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
//        System.out.println("Dentro do construtor");
        this.estudio = estudio;
    }


    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

//    //    incializando tudo que eu tenho
//    public void incicializar(String nome, String tipo, int episodios) {
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//
//    }
//
//    //Sobre carga de metodos com mesmo nome exatamente porem o tipo e a quantidade de elementos são diferentes
//    public void incicializar(String nome, String tipo, int episodios, String genero) {
//        this.incicializar(nome, tipo, episodios);
//        this.genero = genero;
//    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
