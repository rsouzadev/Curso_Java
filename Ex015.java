import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double sal;
        double imposto;
        System.out.println("SEJA BEM-VINDO A LISARB!");
        System.out.print("SALÁRIO:");

        sal = sc.nextDouble();
        if (sal <= 2000){
            System.out.println("ISENTO");
            System.out.print("TOTAL A PAGAR: R$ 00.00");
        }
        else if (sal <= 3000 ){
            System.out.println("8%");
            imposto = (sal - 2000) * 0.08;
            System.out.printf("TOTAL A PAGAR: R$%.2f", imposto);
        }
        else if (sal <=4500){
            System.out.println("18%");
            imposto = (sal - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("TOTAL A PAGAR: R$%.2f", imposto);
        }
        else {
            System.out.println("28%");
            imposto = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("TOTAL A PAGAR: R$%.2f", imposto);
        }




        sc.close();


    }
}
