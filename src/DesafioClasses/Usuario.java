package DesafioClasses;


import java.util.Objects;

public class Usuario {
    String nome;
    String email;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }


}


/* public boolean equals(Object o) {

        Usuario outro = (Usuario) o;

        boolean nomeIgual = outro.nome == this.nome;
        boolean emailIgual  = outro.email == this.email;
        return nomeIgual && emailIgual;


    } */



