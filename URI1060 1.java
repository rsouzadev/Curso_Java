import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        double n6 = sc.nextDouble();
        int soma = 0;

        if(n1 > 0){
            soma = soma + 1;
        }
        if (n2 > 0){
            soma = soma + 1;
        }
        if (n3 > 0){
            soma = soma + 1;
        }
        if (n4 > 0){
            soma = soma + 1;
        }
        if (n5 > 0){
            soma = soma + 1;
        }
        if (n6 > 0){
            soma = soma + 1;
        }
        System.out.printf("%d valores positivos\n",soma);
        sc.close();
    }
}
