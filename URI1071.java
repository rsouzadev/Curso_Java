import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int max,min;
        while (opcao == 1){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < y){
                min = x;
                max = y;
            }
            else {
                min = y;
                max = x;
            }
            int soma = 0;
            for (int i = min + 1; i < max; i++) {
                if (i % 2 != 0){
                    soma = soma + 1;
                }
            }
            System.out.println(soma);
            System.out.println("Continuar[1] Não[2]");
            opcao = sc.nextInt();
            while (opcao != 1 && opcao != 2){
                System.out.println("Continuar[1] Não[2]");
                opcao = sc.nextInt();
            }

        }
        sc.close();
    }
}
