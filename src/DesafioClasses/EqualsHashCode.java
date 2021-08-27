package DesafioClasses;

import javax.swing.plaf.SeparatorUI;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Maicon Jordan";
        u1.email = "maiconplus@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Maicon Jordan";
        u2.email = "maiconplus@gmail.com";

        System.out.println(u1.equals(u2));

    }
}
