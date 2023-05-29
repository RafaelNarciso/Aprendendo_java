package CursoPo;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDoEspirito;

    public void comer() {

    }

    public void dormir() {

    }

    public void soar() {
        System.out.println(" Cri cri");
    }

    public Animal(String nome, String cor, int altura, double peso, String estadoDoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDoEspirito = estadoDoEspirito;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setEstadoDoEspirito(String estadoDoEspirito) {
        this.estadoDoEspirito = estadoDoEspirito;
    }

}
