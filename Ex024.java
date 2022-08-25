import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===BEM-VINDO A ESCOLA BOSQUE===");
        System.out.print("DIGITE SEU NOME POR FAVOR:");
        String nome = sc.next();
        System.out.printf(nome + " INSIRA A NOTA DO 1 BIMESTRE:");
        double nota1 = sc.nextDouble();
        System.out.printf("INSIRA A NOTA DO 2 BIMESTRE:");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("MEDIA:%.2f\n",media);
        if (media < 7){
            System.out.println("REPROVADO");
        }
        else {
            System.out.println("APROVADO");
        }





        sc.close();
    }
}
