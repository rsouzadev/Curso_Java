import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número:");
        num = sc.nextInt();
        if (num > 0) {
            System.out.print("POSITIVO");
        }
        else {
            System.out.print("NEGATIVO");
            }
        sc.close();
    }

}
