import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario >= 0.00 && salario <= 2000.00){
            imposto = 0.0;
        }
        else if (salario > 2000.01 && salario <= 3000.00){
            imposto = (salario - 2000) * 0.08;
        }
        else if (salario > 3000.01 && salario <= 4500.00){
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        if (imposto == 0){
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n",imposto);
        }
        sc.close();
    }
}
