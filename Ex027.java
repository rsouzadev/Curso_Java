import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int maior = x;
        int posicao = 1;

        for (int i=2;i<=6;i++){
            int y = sc.nextInt();
            if (y > maior){
                maior = y;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
}
