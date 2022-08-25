import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1,n2,nota_final;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        nota_final = (n1 + n2);
        if (nota_final < 60.0){
            System.out.printf("NOTA FINAL =  %.1f%n", nota_final);
            System.out.println("REPROVADO");
        }
        else {
            System.out.printf("NOTA FINAL =  %.1f%n", nota_final);
            System.out.println("APROVADO");
        }



        sc.close();
    }
}
