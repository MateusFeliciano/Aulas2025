package br.loja;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Iniciar Venda");
            System.out.println("4. Adicionar ao Carrinho");
            System.out.println("5. Exibir Conteúdo do Carrinho");
            System.out.println("6. Fechar Venda");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine(); // Alterado para String
                    loja.cadastrarCliente(new Cliente(nome, cpf));
                    break;
                case 2:
                    System.out.print("Código do Produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Valor do Produto: ");
                    double valor = scanner.nextDouble();
                    loja.cadastrarProduto(new Produto(codigo, valor));
                    break;
                case 3:
                    System.out.print("Nome do Cliente: ");
                    String clienteNome = scanner.nextLine();
                    if (!loja.iniciarVenda(clienteNome)) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Código do Produto: ");
                    int cod = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int quant = scanner.nextInt();
                    System.out.print("Desconto (%): ");
                    double desc = scanner.nextDouble();
                    loja.adicionarProduto(cod, quant, desc);
                    break;
                case 5:
                    CarrinhoDeCompras carrinho = loja.getVendaEmAndamento();
                    if (carrinho != null) {
                        System.out.println(carrinho.toString());
                    } else {
                        System.out.println("Nenhuma venda em andamento.");
                    }
                    break;
                case 6:
                    System.out.println("Total da venda: " + loja.fecharVenda());
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}