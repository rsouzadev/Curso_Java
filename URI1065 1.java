import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int contador = 0;

        if (n1 % 2 == 0){
            contador = contador + 1;
        }
        if (n2 % 2 == 0){
            contador = contador + 1;
        }
        if (n3 % 2 == 0){
            contador = contador + 1;
        }
        if (n4 % 2 == 0){
            contador = contador + 1;
        }
        if (n5 % 2 == 0){
            contador = contador + 1;
        }
        System.out.printf("%d valores pares\n",contador);

        sc.close();
    }
}
