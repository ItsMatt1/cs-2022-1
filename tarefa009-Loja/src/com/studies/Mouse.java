package com.studies;

public class Mouse extends Produto {
    String tipo;

    public Mouse(String descricao, String tipo)
    {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return descricao + "" + tipo;
    }
}
