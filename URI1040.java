import java.util.Scanner;

public class URI1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float media_pond = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        float media_final;

        System.out.printf("Media: %.1f%n", media_pond);



        if (media_pond >=5.0 && media_pond <=6.9){
            System.out.println("Aluno em exame.");
            float nota_exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n",nota_exame);
            media_final = (nota_exame + media_pond) / 2;
            if (media_final == 5.0 || media_final > 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media_final);
            }
            else {
                System.out.println("Aluno reprovado.");
            }
        }
        else if (media_pond >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
