import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int mai =y;
        int men =x;
        if (x>y){
            mai = x;
            men = y;
        }

        int soma = 0;
        for (int i=men;i<=mai;i++){
            if (i % 13 !=0){
                soma = soma + i;
            }
        }
        System.out.println(soma);


        sc.close();
    }
}
