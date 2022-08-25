import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hi, hf;

        System.out.print("Hora inicial:");
        hi = sc.nextInt();
        System.out.print("Hora final:");
        hf = sc.nextInt();
        int duracao;
        if(hi < hf ){
            duracao = hf - hi;
        }
        else {
            duracao = 24 - hi + hf;
        }
        System.out.print("O JOGO DUROU " + duracao + "HORA(S).");


        sc.close();
    }
}


