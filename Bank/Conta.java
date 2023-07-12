package Bank;

public class Conta {
    private static int codigo = 1001;

    private int numero;
    private Cliente cliente;
    private double saldo = 0.0;
    private double limite = 0.0;
    private double saldoTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    // metado contrutor
    public Conta(Cliente cliente) {
        this.numero = Conta.codigo;// ira gera uma codigo que sera a conta do cliente
        this.cliente = cliente;
        Conta.codigo += 1; // incremento para que nao acha repetição
        this.atualizarSaldoTotal();
    }

    // metado para atualizar o saldo do cliente
    private void atualizarSaldoTotal() {
        this.saldoTotal = this.getSaldo() + this.getLimite();
    }

    // Métado para deposito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.getSaldo() + valor;
            this.atualizarSaldoTotal();
            System.out.println("Depósito efetuado com sucesso !!");
        } else {
            System.out.println("Erro ao efetuar depósito.\nTentei novamente ..");
        }
    }

    // metado para sacar o dinheiro
    public void sacar(double valor) {

        if (valor > 0 && this.getSaldoTotal() >= valor) {
            // caso tenha saldo para sacar
            if (this.getSaldo() >= valor) {
                this.saldo = this.getSaldo() - valor;
                this.atualizarSaldoTotal();
                System.out.println("Saque efetuado com sucesso !!");
            } else {
                // caso queira sacar do limite
                double restante = this.getSaldo() - valor;
                this.limite = this.getLimite() - restante;
                this.saldo = 0.0;
                this.atualizarSaldoTotal();
                System.out.println("Saque efetuado com sucesso !!");

            }

        } else {
            System.out.println("Saque não realizado.\nTente novamente..");
        }
    }

    // metado para tranferir dinheiro
    public void tranferir(Conta destino, doble valor) {
        if (valor > 0 && this.getSaldoTotal() >= valor) {
            if (this.getSaldo() >= valor) {
                this.saldo = this.getSaldo() - valor;
                destino.saldo = destino.getSaldo() + valor;
                this.atualizarSaldoTotal();
                destino.atualizarSaldoTotal();
                System.out.println("Tranferencia realizada com sucesso.");
            } else {
                double restante = this.getSaldo() - valor;
                this.limite = this.getLimite() - restante;
                this.saldo = 0.0;
                destino.saldo = destino.getSaldo() + valor;
                this.atualizarSaldoTotal();
                destino.atualizarSaldoTotal();
                System.out.println("Tranferencia realizada com sucesso.");
            }

        } else {
            System.out.println("Transferência não realizada.\nTente novamente..");
        }
    }

    public String toString() {
        return "Número da Conta : " + this.getNumero() +
                "\nCliente : " + this.cliente.getNome() +
                "\nSaldo Total : " + Utilities.doubleParaString(this.getSaldoTotal());

    }

}
