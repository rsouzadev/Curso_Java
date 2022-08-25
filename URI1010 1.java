import java.util.Scanner;
public class URI1010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cod1,qtd1,cod2,qtd2;
        double vu1,vu2,total;
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        vu1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        vu2 = sc.nextDouble();

        total = vu1 * qtd1 + vu2 * qtd2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);

        sc.close();
    }
}
