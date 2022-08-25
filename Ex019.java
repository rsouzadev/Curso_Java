import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i,n;
        System.out.print("Digite um número:");
        n = sc.nextInt();
        for (i=1; i<n; i = i+2){
            System.out.println(i);
        }
        //Outra alternativa abaixo:
        //for (i=1; i<=n; i = i++){
        //  if(i % 2 != 0){
        //      System.out.println(i);
        //  }
        //}
        sc.close();
    }
}
