import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hi = sc.nextInt();
        int mi = sc.nextInt();
        int hf = sc.nextInt();
        int mf = sc.nextInt();

        int in_jogo = hi * 60 + mi;
        int final_jogo = hf * 60 + mf;
        int duracao;

        if (in_jogo < final_jogo){
            duracao = final_jogo - in_jogo;
        }
        else {
            duracao = ((24 * 60 - in_jogo) + final_jogo);
        }
        int duracao_horas = duracao / 60;
        int duracao_min = duracao % 60;

        System.out.println("O JOGO DUROU " + duracao_horas + " HORA(S) E " + duracao_min + " MINUTO(S)");

        sc.close();
    }
}
