import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {

		
		int a,b,c,d,sub;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número:");
		a = sc.nextInt();
		System.out.print("Digite o segundo número:");
		b = sc.nextInt();
		System.out.print("Digite o terceiro número:");
		c = sc.nextInt();
		System.out.print("Digite o quarto número:");
		d = sc.nextInt();
		
		sub = a*b - c*d;
		
		System.out.println("O resultado é: " + sub);
		
		sc.close();
	}

}
