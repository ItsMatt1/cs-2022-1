package com.studies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda extends Contato{

    public List<Contato> listaContatos = new ArrayList<Contato>();

    public void adicionarContato(Contato e)
    {
        listaContatos.add(e);
    }

    public Contato buscarContato(String nomeOuEmail)
    {
        Contato contatoTemp = new Contato();
        for (Contato contato : listaContatos) {
            if (contato.getNome().equals(nomeOuEmail)) {
                contatoTemp = contato;
            }
            else if (contato.getEmail().equals(nomeOuEmail)) {
                contatoTemp = contato;
            }
        }

        return contatoTemp;
    }

    public void removeContato(String nomeContato) {

        Iterator<Contato> iterator = listaContatos.iterator();
        int aux = 0;

        while (iterator.hasNext()) {

            Contato contatoRemover = iterator.next();
            if (contatoRemover.getNome().equals(nomeContato)) {
                iterator.remove();
                aux++;
            }
        }

        if (aux == 0) {
            System.out.println("Contato de " + nomeContato + " não existe no sistema.");
        } else {
            System.out.println("Contato de " + nomeContato + " foi excluido");
        }
    }

    public void removeContato(Contato contato) {

        for (Contato auxContato : this.listaContatos) {
            if (auxContato.equals(contato)) {
                this.listaContatos.remove(auxContato);
                break;
            }
        }
    }

    public void listarContatos() {
        for (Contato auxConatatos : this.listaContatos) {
            System.out.println(auxConatatos.toString());
        }
    }
}
