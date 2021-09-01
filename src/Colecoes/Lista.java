package Colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Marcos"));
        lista.add(new Usuario("Manuel"));
        lista.add(new Usuario("Pedro"));

        System.out.println(lista.get(2));

        for ( Usuario nomes: lista){
            System.out.println(nomes);
        }



    }
}
