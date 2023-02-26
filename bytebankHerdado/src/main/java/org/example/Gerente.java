package org.example;
public class Gerente extends Funcionario {
    private  int senha ;
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autentica(int senha){
        if(this.senha ==senha){
            return true;
        }else {
            return false;
        }
    }
    //super significa oque esta na classe mãe atributo
    public double getBonificacao() {
        System.out.println("Chamando o meu metodo de bonificação GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}
