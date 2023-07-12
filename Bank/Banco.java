package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    static String nome = " new Bank";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;

    public static void main(String[] args) {
        Banco.contas = new ArrayList<Conta>();
        Banco.menu();

    }

    private static void menu() {
        int opcao = 0;
        System.out.println("========================================");
        System.out.println("================= ATM ==================");
        System.out.println("============= " + Banco.nome + " ================");
        System.out.println("========================================");
        System.out.println("Selecione uma Opção no menu : ");
        System.out.println("1 - Criar conta ");
        System.out.println("2 - Efetuar saque ");
        System.out.println("3 - Efetuar depósito ");
        System.out.println("4 - Efetuar Transfência ");
        System.out.println("5 - Listar contas ");
        System.out.println("6 - Sair do sistema bancario ");

        try {
            opcao = Integer.parseInt(Banco.teclado.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Por favor, informe uma opção válida.");
            Utilities.pausar(1);
            Banco.menu();

        }
        switch (opcao) {
            case 1:
                Banco.criarConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            case 3:
                Banco.efetuarDeposito();
                break;
            case 4:
                Banco.efetuarTransferencia();

                break;
            case 5:
                Banco.listarContas();
                break;
            case 6:
                System.out.println("Áte a proxima!!");
                System.exit(0);
            default:
                System.out.println("Opção invalida.\nTente novamente..");
                Utilities.pausar(2);
                Banco.menu();
                break;
        }

    }

    public static void criarConta() {
        System.out.println("Informe os Dados do Cliente :");

        System.out.println("Nome do cliente :");
        String namee = Banco.teclado.nextLine();

        System.out.println("Email :");
        String emaill = Banco.teclado.nextLine();

        System.out.println("CPF :");
        String cpff = Banco.teclado.nextLine();

        System.out.println("Data de nascimento :");
        String data_nascimento = Banco.teclado.nextLine();

        System.out.println("Endereco :");
        String enderecoo = Banco.teclado.nextLine();

        System.out.println("Numero da casa :");
        String numerodacasaa = Banco.teclado.nextLine();

        System.out.println("Bairro :");
        String bair = Banco.teclado.nextLine();

        Cliente cliente = new Cliente(namee, emaill, cpff, enderecoo, numerodacasaa, bair,
                Utilities.stringParaData(data_nascimento));

        Conta conta = new Conta(cliente);

        Banco.contas.add(conta);

        System.out.println("Conta criada com sucesso");
        System.out.println("Dados da conta criada: ");
        System.out.println(conta);
        System.out.println();
        Utilities.pausar(2);
        Banco.menu();

    }

    public static void efetuarSaque() {
        System.out.println("Informe o número da conta: ");
        int numero = Banco.teclado.nextInt();

        Conta conta = Banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.println("Informe o valor para saque: ");
            Double valor = Banco.teclado.nextDouble();

            conta.sacar(valor);
        } else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utilities.pausar(3);
        Banco.menu();
    }

    public static void efetuarDeposito() {
        System.out.println("Informe o número da conta: ");
        int numero = Banco.teclado.nextInt();

        Conta conta = Banco.buscarContaPorNumero(numero);

        if (conta != null) {
            System.out.println("Informe o valor de depósito: ");
            Double valor = Banco.teclado.nextDouble();

            conta.depositar(valor);
        } else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utilities.pausar(3);
        Banco.menu();
    }

    public static void efetuarTransferencia() {
        System.out.println("Informe o número da sua conta: ");
        int numero_o = Banco.teclado.nextInt();

        Conta conta_o = Banco.buscarContaPorNumero(numero_o);

        if (conta_o != null) {
            System.out.println("Informe o número da conta destino: ");
            int numero_d = Banco.teclado.nextInt();

            Conta conta_d = Banco.buscarContaPorNumero(numero_d);

            if (conta_d != null) {
                System.out.println("Informe o valor da transferência: ");
                Double valor = Banco.teclado.nextDouble();

                conta_o.transferir(conta_d, valor);
            } else {
                System.out.println("A conta destino número " + numero_d + " não foi encontrada.");
            }
        } else {
            System.out.println("Não foi encontrada a conta número " + numero_o);
        }
        Utilities.pausar(3);
        Banco.menu();
    }

    public static void listarContas() {
        if (Banco.contas.size() > 0) {
            System.out.println("Listagem de contas");
            System.out.println();

            for (Conta conta : Banco.contas) {
                System.out.println(conta);
                System.out.println();
                Utils.pausar(1);
            }
            System.out.println();
        } else {
            System.out.println("Não existem contas cadastradas ainda.");
        }
        Utilities.pausar(3);
        Banco.menu();

    }

    private static Conta buscarContaPorNumero(int numero) {
        Conta c = null;
        if (Banco.contas.size() > 0) {
            for (Conta conta : Banco.contas) {
                if (conta.getNumero() == numero) {
                    c = conta;
                }
            }
        }
        return c;
    }

}
