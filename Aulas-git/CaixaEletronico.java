import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor,valor1, saldo = 0,soma = 0;
        int opcao;
      
        
        menu();
        opcao = sc.nextInt();
        
        while(opcao != 0) {
            
        
            if(opcao == 1) {
                
                System.out.println("Seu Saldo é : " + saldo);
                    
                
            }else if(opcao == 2){

                System.out.printf("Informe o valor a ser depositado :");
                valor = sc.nextDouble();
                saldo = valor + saldo;
                System.out.println("\nO seu saldo atual é : "+ saldo);
                
            }else if(opcao == 3){
                
                System.out.printf("Informe o valor para Saque : ");
                valor1 =sc.nextDouble();
                   
                if(valor1 > saldo){
                        System.out.println("Saque não permitido, Saldo insuficiente");
                        System.out.println("Seu saldo e de : " + saldo); 
                    }else{
                     
                         soma = saldo - valor1;
                         System.out.println("Saque efetuado com sucesso : " + soma);
                     
                    }
                
            
                
            }else if (opcao == 4){
               
                System.out.println("O banco agradeçe sua visita !! " );
                break;
                
                
            }else{						
                
                System.out.println("Opção invalida : \ntente os menus de 1 A 4 ");
                break;
            }
            System.out.println("=============================");
            menu();
            opcao = sc.nextInt();
            System.out.println("=============================");
                
        }
     
    }





    public static void  menu() {
        
    
        System.out.printf("\tMenu de operações \n");
        System.out.println("[1]-Mostra saldo");
        System.out.println("[2]-Efetuar deposito");
        System.out.println("[3]-Efetuar saque");
        System.out.println("[4]-finalizar");
     
    }

}