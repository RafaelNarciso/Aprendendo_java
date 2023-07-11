package Mercadinho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Lojinha {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Products> produtos;
    private static Map<Products, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<Products>();
        carrinho = new HashMap<Products, Integer>();
        Lojinha.menu();
    }

    private static void menu() {
        System.out.println("=========================================");
        System.out.println("=============== Bem-vindo(a) ============");
        System.out.println("===============  LOjinha  ===============");
        System.out.println("=========================================");

        System.out.println("Selecione uma opção abaixo: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Comprar produto");
        System.out.println("4 - Visualizar carrinho");
        System.out.println("5 - Sair do sistema");

        int opcao = 0;

        try {
            opcao = Integer.parseInt(Lojinha.teclado.nextLine());
        } catch (InputMismatchException e) {
            Lojinha.menu();
        } catch (NumberFormatException f) {
            Lojinha.menu();
        }

        switch (opcao) {
            case 1:
                Lojinha.cadastrarProduto();
                break;
            case 2:
                Lojinha.listarProdutos();
                break;
            case 3:
                Lojinha.comprarProduto();
                break;
            case 4:
                Lojinha.visualizarCarrinho();
                break;
            case 5:
                System.out.println("Volte sempre!");
                Utilities.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                Utilities.pausar(2);
                Lojinha.menu();
                break;
        }

    }

    private static void cadastrarProduto() {
        System.out.println("Cadastro de Produto");
        System.out.println("====================");

        System.out.println("Informe o nome do produto: ");
        String nome = Lojinha.teclado.nextLine();

        System.out.println("Informe o preço do produto: ");
        Double preco = Lojinha.teclado.nextDouble();

        Products produto = new Products(nome, preco);

        Lojinha.produtos.add(produto);

        System.out.println("O produto " + produto.getNome() + " foi cadastrado com sucesso.");
        Utilities.pausar(2);
        Lojinha.menu();
    }

    private static void listarProdutos() {
        if (Lojinha.produtos.size() > 0) {
            System.out.println("Listagem de produtos");
            System.out.println();

            for (Products p : Lojinha.produtos) {
                System.out.println(p);
                System.out.println();
            }
        } else {
            System.out.println("Ainda não existem produtos cadastrados.");
        }

        Utilities.pausar(2);
        Lojinha.menu();
    }

    private static void comprarProduto() {
        if (Lojinha.produtos.size() > 0) {
            System.out.println("Informe o código do produto que desejar comprar: ");
            System.out.println();

            System.out.println("============== Produtos Disponíveis =============");
            for (Products p : Lojinha.produtos) {
                System.out.println(p);
                System.out.println("------------------------");
            }
            int codigo = Integer.parseInt(Lojinha.teclado.nextLine());
            boolean tem = false;

            for (Products p : Lojinha.produtos) {
                if (p.getCodigo() == codigo) {
                    int quant = 0;
                    try {
                        quant = Lojinha.carrinho.get(p);
                        // Já tem este produto no carrinho, atualiza quantidade
                        Lojinha.carrinho.put(p, quant + 1);
                    } catch (NullPointerException e) {
                        // Primeiro produto no carrinho
                        Lojinha.carrinho.put(p, 1);
                    }

                    System.out.println("O produto " + p.getNome() + " foi adicionado ao carrinho.");
                    tem = true;
                }
            }
            if (tem) {
                System.out.println("Deseja adicionar outros produtos ao carrinho? ");
                System.out.println("Informe 1 para sim ou 0 para não: ");
                int op = Integer.parseInt(Lojinha.teclado.nextLine());

                if (op == 1) {
                    Lojinha.comprarProduto();
                } else {
                    System.out.println("Pro favor, aguarde enquanto fechamos seu pedido...");
                    Utilities.pausar(2);
                    Lojinha.fecharPedido();
                }
            } else {
                System.out.println("Não foi encontrado o produto com o código " + codigo);
                Utilities.pausar(2);
                Lojinha.menu();
            }
        } else {
            System.out.println("Ainda não existe produto cadastrado no mercado.");
            Utilities.pausar(2);
            Lojinha.menu();
        }
    }

    private static void visualizarCarrinho() {
        if (Lojinha.carrinho.size() > 0) {
            System.out.println("Produtos no carrinho: ");

            for (Products p : Lojinha.carrinho.keySet()) {
                System.out.println("Produto: " + p + "\nQuantidade: " + Lojinha.carrinho.get(p));
            }
        } else {
            System.out.println("Ainda não existem produtos no carrinho.");
        }

        Utilities.pausar(2);
        Lojinha.menu();
    }

    private static void fecharPedido() {
        Double valorTotal = 0.0;
        System.out.println("Produtos do Carrinho");
        System.out.println("----------------------");
        for (Products p : Lojinha.carrinho.keySet()) {
            int quant = Lojinha.carrinho.get(p);
            valorTotal += p.getPreco() * quant;
            System.out.println(p);
            System.out.println("Quantidade: " + quant);
            System.out.println("----------------------");
        }
        System.out.println("Sua fatura é " + Utilities.doubleParaString(valorTotal));
        Lojinha.carrinho.clear();
        System.out.println("Obrigado pela preferência.");
        Utilities.pausar(5);
        Lojinha.menu();

    }

}
