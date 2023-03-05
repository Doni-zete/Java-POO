package org.example;

public class SistemInterno {
    private  int senha = 2222;
    public void autentica(Autenticavel fa){
     boolean autenticou = fa.autentica(this.senha);
     if(autenticou){
         System.out.println("Pode entrar no sistema " + senha);
     }else {
         System.out.println("não pode entrar no sistema " + senha);
     }
    }
}
