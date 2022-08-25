import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0;
        int cont = 0;
        int soma = 0;
        double media;

        idade = sc.nextInt();
        while (idade > 0){
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }
        media = (double) soma / cont;
        System.out.printf("%.2f\n",media);

        sc.close();
    }
}
