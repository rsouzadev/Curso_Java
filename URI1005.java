import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media_pond;
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        media_pond = (nota1 * 3.5 + nota2 * 7.5) / 11.0;
        System.out.printf("MEDIA = %.5f%n", media_pond);
        sc.close();
    }
}
