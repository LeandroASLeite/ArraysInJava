package br.com.poo.lista.agenda;
import br.com.poo.lista.contato.Contato;

import br.com.poo.lista.interfaceUsuario.InterfaceUsuario;

public class Agenda {
    private String nome;
    private String email;
    private String proprietario;

    private Contato[] contatos;

    public Agenda(String nome, String email, String proprietario, int len) {
        this.nome = nome;
        this.email = email;
        this.proprietario = proprietario;
        this.contatos = new Contato[len];
    }

    public void adicionarContato(Contato contato) {
        for (int i = 0; i < this.contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            }
        }
    }

    public void listarContatos() {
        InterfaceUsuario ui = new InterfaceUsuario();
        for (Contato contato : this.contatos) {
            if (contato != null) {
                ui.mostrarNaTela(contato.obterDados());
            }
        }
    }

    public Contato buscarPorPosicao(int posicao) {
        return this.contatos[posicao];
    }

    public void listarQuantidadeContatos() {
        int aux = 0;
        for (int i = 0; i < this.contatos.length; i++) {
            if (contatos[i] != null) {
                aux = aux + 1;
            }
        }
        System.out.println(aux);

    }

    public String getProprietario() {
        return proprietario;
    }
}


