package Bank;

import java.util.Date;

public class Cliente {
    // Contador que ira se inicializar a partir de 101 e ira se incrementa
    private static int contator = 101();

    private int codigo;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Date dataCadastro;
    // ==========================================================
    private String endereco;
    private String bairro;
    private int numeroDaCasa;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numero) {
        this.numeroDaCasa = numeroDaCasa;
    }

    // =========================================================
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Date getDataCadastro() {
        return this.dataCadastro;
    }

    public Cliente(String nome, String email, String cpf, Date dataNascimento, String endereco, int numeroDaCasa,
            String bairo) {
        this.codigo = Cliente.contator;// incrementando o codigo com o contador
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        // ------------------------------
        this.endereco = endereco;
        this.numeroDaCasa = numeroDaCasa;
        this.bairro = bairo;
        // -----------------------
        this.dataCadastro = new Date(); // ira trazer a data atual
        Cliente.contator += 1; // incremento de conta a partir do 101

    }

    public String toString() {
        return "Código : " + this.getCodigo() +
                "\nNome : " + this.getNome() +
                "\nEmail : " + this.getEmail() +
                "\nCPF : " + this.getCpf() +
                "\nData de Nascimento : " + Utilities.dateParaString(this.getDataNascimento()) +
                "\nData de Cadastro : " + Utilities.dateParaString(this.getDataCadastro()) +
                "\nEndereço : " + this.getEndereco() +
                "\nNumero : " + this.getNumeroDaCasa() +
                "\nBairro : " + this.getBairro();

    }

}
