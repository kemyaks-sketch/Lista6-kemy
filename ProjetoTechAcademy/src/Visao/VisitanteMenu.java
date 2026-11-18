package Visao;

import Dominio.Visitante;
import Servico.VisitanteServ;
import java.util.Scanner;

public class VisitanteMenu {

    private VisitanteServ servico;
    private Scanner scanner;

    public VisitanteMenu() {
        this.servico = new VisitanteServ();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = 0;
        do {
            System.out.println("\n=== MENU VISITANTE ===");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar Todos");
            System.out.println("3. Buscar por Código");
            System.out.println("4. Editar");
            System.out.println("5. Excluir");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    this.cadastrar();
                    break;
                case 2:
                    this.listarTodos();
                    break;
                case 3:
                    this.buscarPorCodigo();
                    break;
                case 4:
                    this.editar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 6:
                    System.out.println("Encerrando o menu...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private void cadastrar() {
        System.out.println("\n--- Cadastrar Visitante ---");
        Visitante v = new Visitante();
        System.out.print("Nome: ");
        v.setNome(scanner.nextLine());
        System.out.print("CPF: ");
        v.setCpf(scanner.nextLine());
        System.out.print("E-mail: ");
        v.setEmail(scanner.nextLine());
        System.out.print("Telefone: ");
        v.setTelefone(scanner.nextLine());
        System.out.print("Endereço: ");
        v.setEndereco(scanner.nextLine());
        System.out.print("Motivo da Visita: ");
        v.setMotivoVisita(scanner.nextLine());
        System.out.print("Número do Crachá: ");
        v.setCrachaNumero(Integer.parseInt(scanner.nextLine()));
        System.out.print("Setor da Visita: ");
        v.setSetorVisita(scanner.nextLine());

        this.servico.adicionar(v);
        System.out.println("Visitante cadastrado com sucesso!");
    }

    private void listarTodos() {
        System.out.println("\n--- Lista de Visitantes ---");
        for (Visitante v : this.servico.listar()) {
            v.exibir();
            System.out.println("---------------------------");
        }
    }

    private void buscarPorCodigo() {
        System.out.print("\nDigite o código do visitante: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Visitante v = this.servico.buscar(codigo);
        if (v != null) {
            v.exibir();
        } else {
            System.out.println("Visitante não encontrado.");
        }
    }

    private void editar() {
        System.out.print("\nDigite o código do visitante para editar: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Visitante v = this.servico.buscar(codigo);
        if (v != null) {
            System.out.println("Dados atuais:");
            v.exibir();
            System.out.print("\nNovo Nome: ");
            v.setNome(scanner.nextLine());
            System.out.print("Novo CPF: ");
            v.setCpf(scanner.nextLine());
            System.out.print("Novo E-mail: ");
            v.setEmail(scanner.nextLine());
            System.out.print("Novo Telefone: ");
            v.setTelefone(scanner.nextLine());
            System.out.print("Novo Endereço: ");
            v.setEndereco(scanner.nextLine());
            System.out.print("Novo Motivo da Visita: ");
            v.setMotivoVisita(scanner.nextLine());
            System.out.print("Novo Número do Crachá: ");
            v.setCrachaNumero(Integer.parseInt(scanner.nextLine()));
            System.out.print("Novo Setor da Visita: ");
            v.setSetorVisita(scanner.nextLine());

            this.servico.editar(v);
            System.out.println("Visitante atualizado com sucesso!");
        } else {
            System.out.println("Visitante não encontrado.");
        }
    }

    private void excluir() {
        System.out.print("\nDigite o código do visitante para excluir: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        Visitante v = this.servico.buscar(codigo);
        if (v != null) {
            v.exibir();
            System.out.print("Confirmar exclusão? (S/N): ");
            String conf = scanner.nextLine();
            if (conf.equalsIgnoreCase("S")) {
                this.servico.excluir(codigo);
                System.out.println("Visitante excluído com sucesso!");
            } else {
                System.out.println("Operação cancelada.");
            }
        } else {
            System.out.println("Visitante não encontrado.");
        }
    }
}
