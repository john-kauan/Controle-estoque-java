package util;

import model.Produto;
import service.ProdutoService;

import java.util.Scanner;

public class Menu {

    public void MenuPrincipal(){

        Scanner scanner = new Scanner(System.in);
        ProdutoService ps = new ProdutoService();

        int opcao;

        do{
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Saída no estoque");
            System.out.println("3 - Entrada no estoque");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Remover Produto");
            System.out.println("0 - Sair");
            System.out.println("DIGITE UMA OPÇÃO: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();

                    ps.cadastrarProduto(new Produto(id, nome, descricao, valor, quantidade));
                    break;

                case 2:
                    System.out.print("ID do produto: ");
                    int id2 = scanner.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidade2 = scanner.nextInt();

                    ps.saidaProduto(id2, quantidade2);
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    int id3 = scanner.nextInt();

                    System.out.print("Quantidade: ");
                    int quantidade3 = scanner.nextInt();

                    ps.entradaProduto(id3, quantidade3);
                    break;

                case 4:
                    ps.listarProduto();
                    break;

                case 5:
                    System.out.println("ID do produto: ");
                    int id4 = scanner.nextInt();

                    ps.removerProduto(id4);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;

            }

        }while (opcao != 0);

        scanner.close();

    }
}
