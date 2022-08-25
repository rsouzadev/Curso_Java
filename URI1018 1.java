import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor_informado, notas, resto;

        valor_informado = sc.nextInt();

        notas = valor_informado / 100;
        resto = valor_informado % 100;
        System.out.println(valor_informado);
        System.out.println(notas + " nota(s) de R$ " + "100,00");

        notas = resto / 50;
        resto = resto % 50;

        System.out.println(notas + " nota(s) de R$ " + "50,00");

        notas = resto /20;
        resto = resto % 20;

        System.out.println(notas + " nota(s) de R$ " + "20,00");
        notas = resto / 10;
        resto = resto % 10;

        System.out.println(notas + " nota(s) de R$ " + "10,00");
        notas = resto / 5;
        resto = resto % 5;

        System.out.println(notas + " nota(s) de R$ " + "5,00");
        notas = resto / 2;
        resto = resto % 2;

        System.out.println(notas + " nota(s) de R$ " + "2,00");

        notas = resto / 1;
        resto = resto % 1;
        System.out.println(notas + " nota(s) de R$ " + "1,00");
        sc.close();
    }
}
