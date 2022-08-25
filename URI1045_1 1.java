import java.util.Scanner;

public class URI1045_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double A,B,C;
        //Verificar se o n1 é maior que todos.
        if (n1 > n2 && n1 > n3){
            A = n1; //Garantindo que A serã maior.
            if (n2 > n3){
                B = n2; // Mantendo a sequencia.
                C = n3;
            }
            else {
                B = n3; //Mantendo a sequencia.
                C = n2;
            }
        }
        //Verificar se o n2 é o maior de todos.
        else if (n2 > n3){
            A = n2;
            if (n1 > n3){
                B = n1;
                C = n3;
            }
            else {
                B = n3;
                C = n1;
            }
        }
        //Verificar se o n3 é o maior de todos.
        else {
            A = n3;
            if (n1 > n2){
                B = n1;
                C = n2;
            }
            else {
                B = n2;
                C = n1;
            }
        }

        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            if (A * A == B * B + C * C){
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (A * A > B * B + C * C){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C){
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (A == B || A == C || B == C){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
