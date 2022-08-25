import java.util.Scanner;
public class Ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a,b,c,area_triangulo,area_trapezio,area_quadrado, area_retangulo,area_circulo;

		System.out.print("A:");
		a = sc.nextDouble();
		System.out.print("B:");
		b = sc.nextDouble();
		System.out.print("C:");
		c = sc.nextDouble();

		area_triangulo = a * c / 2;
		area_circulo = 3.14159 * c * c;
		area_trapezio = (a + b) / 2 * c;
		area_quadrado = b * b;
		area_retangulo = a * b;
		System.out.printf("AREA DO TRIANGULO: %.2f%n", area_triangulo);
		System.out.printf("AREA DO CIRCULO DE RAIO:%.3f\n",area_circulo);
		System.out.printf("AREA DO TRAPEZIO:%.2f\n",area_trapezio);
		System.out.printf("AREA DO QUADRADO:%.2f\n",area_quadrado);
		System.out.printf("AREA DO RETANGULO:%.2f",area_retangulo);
		sc.close();
	}

}
