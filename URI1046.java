import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h_inicial = sc.nextInt();
        int h_final =sc.nextInt();
        int duracao;

        if (h_inicial < h_final){
            duracao = h_final - h_inicial;

        }
        else {
            duracao = 24 - h_inicial + h_final;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
