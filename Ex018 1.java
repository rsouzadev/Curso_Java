import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int comb;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        System.out.println("ESCOLHA O COMBUSTÍVEL:");
        System.out.println("[1] ALCOOL:");
        System.out.println("[2] GASOLINA:");
        System.out.println("[3] DIESEL:");
        System.out.println("[4] SAIR:");
        System.out.print("OPÇÃO:");
        comb = sc.nextInt();
        while (comb != 4){
            if (comb == 1){
                alcool = alcool + 1;
            }
            else if (comb == 2){
                gasolina = gasolina + 1;
            }
            else if (comb == 3){
                diesel = diesel + 1;
            }
            else if(comb !=4 && comb >= 5){
                System.out.println("OPÇÃO INVÁLIDA!");
            }

            System.out.print("OPÇÃO:");
            comb = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
