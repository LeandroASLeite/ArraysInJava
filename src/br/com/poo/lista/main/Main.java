package br.com.poo.lista.main;
import br.com.poo.lista.agenda.*;
import br.com.poo.lista.interfaceUsuario.InterfaceUsuario;
import br.com.poo.lista.contato.Contato;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario ui = new InterfaceUsuario();
        ui.mostrarNaTela("Entre com o nome: ");
        String nomeAgenda = ui.lerDados().next();
        ui.mostrarNaTela("Entre com o email: ");
        String emailAgenda = ui.lerDados().next();
        ui.mostrarNaTela("Entre com o proprietário: ");
        String proprietarioAgenda = ui.lerDados().next();
        ui.mostrarNaTela("Entre com a quanidade máxima de contatos: ");
        int len = ui.lerDados().nextInt();
        Agenda agenda = new Agenda(nomeAgenda, emailAgenda, proprietarioAgenda, len);
        int opcao = -1;
        do {
            System.out.println("        ◦ Sistema br.com.poo.lista.agenda.Agenda do " + agenda.getProprietario() + "\n        ◦ === Opções ===\n" + "        ◦ 1. Adicionar br.com.poo.lista.contato.Contato\n" + "        ◦ 2. Listar todos os Contatos\n" + "        ◦ 3. Buscar br.com.poo.lista.contato.Contato por posição\n" + "        ◦ 4. Consultar Quantidade de Contatos\n" + "        ◦ 0. Sair do Sistema");

            opcao = ui.lerDados().nextInt();
            switch (opcao) {
                case 1:
                    ui.mostrarNaTela("Entre com o nome: ");
                    String nome = ui.lerDados().next();

                    ui.mostrarNaTela("Entre com o email: ");
                    String email = ui.lerDados().next();

                    ui.mostrarNaTela("Entre com o telefone principal: ");
                    String telefonePrincipal = ui.lerDados().next();

                    ui.mostrarNaTela("Entre com o telefone secundário: ");
                    String telefoneSecundário = ui.lerDados().next();

                    Contato contato = new Contato(nome, email, telefonePrincipal, telefoneSecundário);
                    agenda.adicionarContato(contato);


                    break;
                case 2:
                    agenda.listarContatos();

                    break;
                case 3:
                    ui.mostrarNaTela("Índice do br.com.poo.lista.contato");
                    int indiceContato = ui.lerDados().nextInt();
                    ui.mostrarNaTela(agenda.buscarPorPosicao(indiceContato).obterDados());
                    break;
                case 4:
                    agenda.listarQuantidadeContatos();
                    break;
                case 0:
                    ui.mostrarNaTela("Saindo...");

            }
        } while (opcao != 0);

    }
}
