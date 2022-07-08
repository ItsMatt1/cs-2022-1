package com.studies;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Heroi", "heroi@world.com");
        Contato contato2 = new Contato("Leão", "lion@gmail.com");
        Contato contato3 = new Contato("Marcos", "Marquinhos2003@gmail.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        agenda.listarContatos();

        agenda.removeContato("Leão");

        agenda.listarContatos();

        Contato contatoBuscado;

        contatoBuscado = agenda.buscarContato("heroi@world.com");

        System.out.println(contatoBuscado);

    }
}
