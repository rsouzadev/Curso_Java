import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A,B,C;
        double area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        area_triangulo = A * C / 2.0;
        area_circulo = 3.14159 * C * C;
        area_trapezio = (A + B) / 2.0 * C;
        area_quadrado = Math.pow(B,2);
        area_retangulo = A * B;
        System.out.printf("TRIANGULO: %.3f%n", area_triangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);
        sc.close();
    }
}
