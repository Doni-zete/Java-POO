//Gerente e  um funcionario, genrete herad da class Funcionario, assina o contrato autencticavel

package org.example;
public class Gerente extends Funcionario  implements  Autenticavel {
    //super significa oque esta na classe mãe atributo

    private int senha;

    public double getBonificacao() {
        System.out.println("Chamando o meu metodo de bonificação GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
