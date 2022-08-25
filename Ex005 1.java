import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {

		
		int id;
		double ht, v, s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID:");
		id = sc.nextInt();
		System.out.print("Horas trabalhadas:");
		ht = sc.nextDouble();
		System.out.print("Valor por hora trabalhada:");
		v = sc.nextDouble();
		
		s = ht * v;
		
		System.out.println("ID: " + id);
		System.out.printf("SALÁRIO:U$ %.2f", s);
		
		sc.close();
	}

}
