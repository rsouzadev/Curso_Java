import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reaj;
        double percentual;
        if (salario >= 0.00 && salario <= 400.00){
            reaj = salario * (0.15);
            percentual = 15.0;

        }
        else if (salario > 400.00 && salario <= 800.00){
            reaj = salario * (0.12);
            percentual = 12.0;

        }
        else if (salario > 800.00 && salario <= 1200.00){
            reaj = salario * (0.10);
            percentual = 10.0;
        }
        else if (salario > 1200.00 && salario <= 2000.00){
            reaj = salario * (0.07);
            percentual = 7.0;
        }
        else {
            reaj = salario * (0.04);
            percentual = 4.0;
        }
        sc.close();
        double sal_com_reaj = salario + reaj;
        System.out.printf("Novo salario: %.2f%n", sal_com_reaj);
        System.out.printf("Reajuste ganho: %.2f%n", reaj);
        System.out.printf("Em percentual: %.0f %%%n", percentual);

    }
}
