import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        double total;
        if (codigo == 1){
            total = qtd * 4.0;

        }
        else if (codigo == 2){
            total = qtd * 4.5;

        }
        else if (codigo == 3){
            total = qtd * 5.0;

        }
        else if (codigo == 4){
            total = qtd * 2.0;

        }
        else {
            total = qtd * 1.5;

        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
