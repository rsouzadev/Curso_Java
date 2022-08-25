import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum;
		
		System.out.print("Type a number:");
		n1 = sc.nextInt();
		System.out.print("Type another number:");
		n2 = sc.nextInt();
		
		sum = n1 + n2;
		System.out.printf("The sum of %d + %d is: %d", n1, n2, sum);		
		
		sc.close();

	}

}
