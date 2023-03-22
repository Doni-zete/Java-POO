package Gassociacao.dominio;

public class Local {
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    private String endereco;
}
