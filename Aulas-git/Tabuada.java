import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("________________________Tabuada________________________\n\n");


        System.out.printf("\nInforme um numero pra efetuar a tabuada : ");
        int N = sc.nextInt();

        

            for(int i = 0 ; i <= 10 ; i++){
                System.out.println("Tabuada do " + N + " x " + i + " = "+ N * i );
            }

            for(int i = 0 ; i <= 10 ; i++){
                System.out.println("Tabuada do " + N + " x " + i + " = "+ N - i );
            }
            
       
        sc.close();
    }
}
