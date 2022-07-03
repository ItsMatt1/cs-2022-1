package com.studies;

public class Livro extends Produto {
    String autor;

    public Livro(String descricao, String autor)
    {
        this.descricao = descricao;
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return descricao + "" + autor;
    }
}
