import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario,vendas, comissao, tot_sal_com;
        nome = sc.next();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();
        comissao = vendas * 15 / 100;
        tot_sal_com = comissao + salario;
        System.out.printf("TOTAL = R$ %.2f%n", tot_sal_com);
        sc.close();
    }
}
