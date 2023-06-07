import java.util.Scanner;

public class Tabuada_Atualizada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("________________________Tabuada________________________\n\n");

		System.out.printf(
				"\nInforme o numero da tabuada desejada : \n\n1-Multiplicação \n2-Adição \n3-Divisão \n4-Subtração\n");
		int N = sc.nextInt();

		switch (N) {

			case 1:
				System.out.printf("\nInforme um numero pra realizar a tabuada de multiplicação :  ");
				int M = sc.nextInt();
				for (int i = 0; i <= 10; i++) {
					System.out.println(M + " x " + i + " = " + M * i);
				}
				break;

			case 2:
				System.out.printf("\nInforme um numero pra realizar a tabuada Adição : ");
				int A = sc.nextInt();
				for (int i = 0; i <= 10; i++) {
					System.out.println(A + " + " + i + " = " + (A + i));
				}
				break;

			case 3:
				System.out.printf("\nInforme um numero pra realizar a tabuada da Divisão : ");
				double D = sc.nextInt();
				for (double i = 0; i <= 10; i++) {
					double total = (D / i);
					System.out.println(D + " / " + i + " = " + String.format("%.2f", total));
				}
				break;
			case 4:
				System.out.printf("\nInforme um numero pra realizar a tabuada de Subtração : ");
				int S = sc.nextInt();

				for (int i = 0; i <= 10; i++) {

					System.out.println(S + " - " + i + " = " + (S - i));
				}
				break;

			default:
				System.out.println(" Função indisponivel ");
				break;
		}

		sc.close();
	}
}
