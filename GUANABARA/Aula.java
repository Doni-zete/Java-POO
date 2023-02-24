public class Aula {
    public static void main(String[]args){

        Caneta c1 = new Caneta();
        c1.modelo ="com tampa";
        c1.cor= "Verde";
        c1.ponta = 0.6f;

        c1.destampar();
        c1.carga = 50;
        c1.status();
        c1.rabiscar();

        System.out.println("------------------------------");
        Caneta c2 = new Caneta();

        c2.modelo = "Bluble";
        c2.cor = "Laranja";
        c2.tampar();
        c2.status();
        c2.rabiscar();


    }
}
