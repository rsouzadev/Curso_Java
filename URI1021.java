import java.util.Scanner;
public class URI1021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N;
        int valor;

        N = sc.nextDouble();

        System.out.println("NOTAS:");
        valor = (int) N / 100;
        System.out.printf("%d nota(s) de R$ 100.00%n",valor);
        N = N % 100;

        valor = (int) N / 50;
        System.out.printf("%d nota(s) de R$ 50.00%n",valor);
        N = N % 50;

        valor = (int) N / 20;
        System.out.printf("%d nota(s) de R$ 20.00%n",valor);
        N = N % 20;

        valor = (int) N / 10;
        System.out.printf("%d nota(s) de R$ 10.00%n",valor);
        N = N % 10;

        valor = (int) N / 5;
        System.out.printf("%d nota(s) de R$ 5.00%n",valor);
        N = N % 5;

        valor = (int) N / 2;
        System.out.printf("%d nota(s) de R$ 2.00%n",valor);
        N = N % 2;

        System.out.println("MOEDAS:");
        N = N * 100;
        valor = (int) N / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n",valor);
        N = N % 100;

        valor = (int) N / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n",valor);
        N = N % 50;

        valor = (int) N / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n",valor);
        N = N % 25;

        valor = (int) N / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n",valor);
        N = N % 10;

        valor = (int) N / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n",valor);
        N = N % 5;

        valor = (int) N / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n",valor);
        N = N % 1;

        sc.close();


    }
}
