package com.studies;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto[] carrinho = new Produto[4];

        carrinho[0] = new Mouse("Saída USB. 1.600 dpi", " Óptico");
        carrinho[1] = new Livro("Alice no País das Maravilhas", " Lewis Carroll");
        carrinho[2] = new Mouse("Saída USB. 2.000 dpi", " Bluetooth");
        carrinho[3] = new Livro("Dom Quixote", " Miguel de Cervantes");

        for (int i = 0; i < 4; i++) {
            System.out.println(carrinho[i].getDescricao());
        }
    }
}
