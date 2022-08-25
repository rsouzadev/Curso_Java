import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {

		
		
		int c1, c2, q1, q2;
		double vu1, vu2,vf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código:");
		c1 = sc.nextInt();
		System.out.print("Quantidade:");
		q1 = sc.nextInt();
		System.out.print("Valor Unitário:");
		vu1 = sc.nextDouble();
		
		System.out.print("Código:");
		c2 = sc.nextInt();
		System.out.print("Quantidade:");
		q2 = sc.nextInt();
		System.out.print("Valor Unitário:");
		vu2 = sc.nextDouble();
		
		vf = q1 * vu1 + q2 *vu2; 
		System.out.printf("VALOR A PAGAR: R$%.2f", vf);
		
		
		sc.close();	
	}

}
