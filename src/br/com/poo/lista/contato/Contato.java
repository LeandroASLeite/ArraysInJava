package br.com.poo.lista.contato;

public class Contato {
    private String nome;
    private String email;
    private String telefonePrincipal;
    private String telefoneSecundario;


    public Contato(String nome, String email, String telefonePrincipal, String telefoneSecundario) {
        this.nome = nome;
        this.email = email;
        this.telefonePrincipal = telefonePrincipal;
        this.telefoneSecundario = telefoneSecundario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String obterDados() {
        return "Contato: " + this.nome + " E-mail: " + this.email + " Telefone Principal: " + this.telefonePrincipal + " Telefone Secundário: " + this.telefoneSecundario;

    }

}

