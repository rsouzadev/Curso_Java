import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número:");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("PAR");
        }
        else{
            System.out.print("ÍMPAR");
            }
        sc.close();

    }
}
