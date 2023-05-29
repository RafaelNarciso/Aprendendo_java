package CursoPo;

public class Cachorro extends Animal {
    /**
     * classe
     * 1 atributos
     * 2 contrutores
     * 3 metodos
     */
    // atributos
    static int numerosDecacchorro;

    public static int getNumerosDecacchorro() {
        return numerosDecacchorro;
    }

    // contrutores
    public static void setNumerosDecacchorro(int numerosDecacchorro) {
        Cachorro.numerosDecacchorro = numerosDecacchorro;
    }

    public Cachorro(String nome, String cor, int altura, double peso, /* int tamanhoDoRabo */ String estadoDoEspirito) {
        super(nome, cor, altura, peso, estadoDoEspirito);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        // this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDoEspirito = estadoDoEspirito;
        this.numerosDecacchorro++;
    }

    // o nome GET = pegar, onde informamos o valor para quem chamar
    public String getNome() {
        return nome; // aqui ele esta return o valor
                     // consegue manipular o retorno
    }

    // o nome SET = coloca valor na variavel
    public void setNome(String nome) {

        this.nome = nome;// aqui notamos que o nome recebe nome
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDoEspirito() {
        return estadoDoEspirito;
    }

    /*
     * public int getTamanhoDoRabo() {
     * return tamanhoDoRabo;
     * }
     * public void setTamanhoDoRabo(int tamanhoDoRabo) {
     * this.tamanhoDoRabo = tamanhoDoRabo;
     * }
     */
    // metodos
    // neste metodo declaramos a variavel String para retorna valor
    public String pegar() {// aqui estamos declarando retorno do metodo
        return "Bolinha";// aqui e necessario return de um valor do mesmo tipo que foi declarado,
                         // no caso aqui o valor e String return têm quer ser texto ou frase.
    }

    public String interagir(String acao) {

        switch (acao) {

            case "carrinho":
                this.estadoDoEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDoEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDoEspirito = "triste";
                break;
            default:
                this.estadoDoEspirito = "neutro";
                break;

        }
        return this.estadoDoEspirito;
    }
    /*
     * @Override
     * public String toString() {
     * 
     * return "Cachorro {" + nome +" }";
     * }
     * 
     * @Override
     * public void soar() {
     * 
     * System.out.println("AU AU");
     * }
     */
}
