package Gassociacao.test;

// Relacionamento de Muitos para um

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi");
        Professor professor2 = new Professor("Ondaime");
        Professor[] professores = {professor1,professor2};

        Escola escola = new Escola("Aldeia de Konoha", professores);

        escola.imprimir();
    }
}
