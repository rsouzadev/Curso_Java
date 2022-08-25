import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int soma = 0;
        int x = sc.nextInt();

        while (x != 0){
            if (x % 2 == 0){
                soma = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
                System.out.println(soma);
            }
            else {
                soma = x + 1 + (x +1 + 2) + (x + 1 + 4) + (x + 1 + 6) + (x + 1 + 8);
                System.out.println(soma);
            }
            x = sc.nextInt();
        }
        sc.close();
    }
}
