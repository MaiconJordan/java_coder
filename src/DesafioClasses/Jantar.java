package DesafioClasses;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 =new Comida("arroz", 0.33);
        Comida c2 = new Comida("Feijao", 0.5);

        Pessoa p1 = new Pessoa("Joao", 10.0);
        Pessoa p2 = new Pessoa("Pedro", 20.0);

        p1.comer(c2);

        System.out.println(p1.peso + " " +p1.nome);

    }
}
