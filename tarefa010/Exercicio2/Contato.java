package com.studies;

public class Contato {
    public String nome;
    public String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Contato() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Email = " + email+ " ";
    }
}
