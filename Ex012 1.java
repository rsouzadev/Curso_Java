import java.util.Scanner;
public class Ex012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int qtd;
        double total;

        System.out.println("===ESCOLHA A OPÇÃO ABAIXO:===");
        System.out.println("[1]CACHORRO QUENTE");
        System.out.println("[2]X-SALADA");
        System.out.println("[3]X-BACON");
        System.out.println("[4]TORRADA SIMPLES");
        System.out.println("[5]REFRIGERANTE");
        codigo = sc.nextInt();
        if (codigo == 1){
            System.out.print("[1]CACHORRO-QUENTE ==> ");
            System.out.print("QUANTIDADE: ");
            qtd = sc.nextInt();
            total = qtd * 4.00;
            System.out.printf("TOTAL A PAGAR: R$%.2f" , total);
        }
        else if (codigo == 2){
            System.out.print("[2}X-SALADA ==> ");
            System.out.print("QUANTIDADE: ");
            qtd = sc.nextInt();
            total = qtd * 4.50;
            System.out.printf("TOTAL A PAGAR: R$%.2f", total);
        }
        else if (codigo == 3){
            System.out.print("[3}X-BACON ==> ");
            System.out.print("QUANTIDADE: ");
            qtd = sc.nextInt();
            total = qtd * 5.00;
            System.out.printf("TOTAL A PAGAR: R$%.2f", total);
        }
        else if (codigo == 4){
            System.out.print("[4}TORRADA SIMPLES ==> ");
            System.out.print("QUANTIDADE: ");
            qtd = sc.nextInt();
            total = qtd * 2.00;
            System.out.printf("TOTAL A PAGAR: R$%.2f", total);
        }
        else if (codigo == 5){
            System.out.print("[5}REFRIGERANTE ==> ");
            System.out.print("QUANTIDADE: ");
            qtd = sc.nextInt();
            total = qtd * 1.50;
            System.out.printf("TOTAL A PAGAR: R$%.2f", total);
        }
        sc.close();




    }

}
