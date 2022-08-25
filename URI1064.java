import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        double n6 = sc.nextDouble();
        int contador = 0;
        double media;
        double soma = 0;

        if (n1 > 0){
            contador = contador + 1;
            soma = soma + n1;
        }
        if (n2 > 0){
            contador = contador + 1;
            soma = soma + n2;
        }
        if (n3 > 0){
            contador = contador + 1;
            soma = soma + n3;
        }
        if (n4 > 0){
            contador = contador + 1;
            soma = soma + n4;
        }
        if (n5 > 0){
            contador = contador + 1;
            soma = soma + n5;
        }
        if (n6 > 0){
            contador = contador + 1;
            soma = soma + n6;
        }
        media = soma / contador;
        System.out.printf("%d valores positivos\n",contador);
        System.out.printf("%.1f\n",media);
    }
}
