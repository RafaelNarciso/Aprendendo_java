package CursoPo;

public class Gato extends Animal{
    static int numeroDeGatos;
   
    
  public Gato(String nome, String cor, int altura, double peso, String estadoDoEspirito){
    super(nome, cor, altura, peso, estadoDoEspirito );
  }

    @Override
    public String toString() {
       
        return "Gato { nome " + nome + " }";
    }
        /**
         * Atraves do @Override e possivel modificar o ira acontecer 
         * no casso aqui modificamos o som do animal em vez de sair cri cri
         * do methodo pai, o animal aqui recebeu o som da voz de acordo com 
         * sua espece no caso gato faz miau .
         */
    @Override
    public void soar() {
       System.out.println("MIAU MIAU");
    }

}
