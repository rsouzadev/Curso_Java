import java.util.Scanner;

public class URI1043_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double P = A + B + C;
        double Ar = (A + B) / 2 * C;

        if ((A < (B+C)) && (B < (C+A)) && (C < (A+B))){
            System.out.printf("Perimetro = %.1f",P);
        }
        else {
            System.out.printf("Area = %.1f",Ar);
        }
        sc.close();
    }
}
