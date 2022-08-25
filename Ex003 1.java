import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		double r, a, pi = 3.14159;
		
		System.out.print("Digite o valor do raio:");
		r = sc.nextDouble();
		a = pi * r * r;
		System.out.printf("O valor da area é %.4f ", a);
		
		sc.close();

	}

}
