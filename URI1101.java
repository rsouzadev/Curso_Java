import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        while (m >0 && n>0){
            int maior;
            int menor;
            if (m > n){
                maior = m;
                menor = n;
            }
            else {
                maior = n;
                menor = m;
            }
            int soma=0;
            for (int i=menor;i<=maior;i++){
                soma = soma +i;
                System.out.print(i+" ");
            }
            System.out.println("Sum="+soma);
            m = sc.nextInt();
            n = sc.nextInt();
        }
        sc.close();
    }
}
