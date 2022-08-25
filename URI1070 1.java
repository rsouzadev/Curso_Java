import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X > 0 && X % 2 !=0){
            System.out.println(X);
            System.out.println(X+2);
            X = X + 2;
            System.out.println(X+2);
            X = X + 2;
            System.out.println(X+2);
            X = X + 2;
            System.out.println(X+2);
            X = X + 2;
            System.out.println(X+2);
        }
        else if (X>0 && X % 2 ==0){
            System.out.println(X+1);
            X = X + 2;
            System.out.println(X+1);
            X = X + 2;
            System.out.println(X+1);
            X = X + 2;
            System.out.println(X+1);
            X = X + 2;
            System.out.println(X+1);
            X = X + 2;
            System.out.println(X+1);
        }
        else {
            System.out.println("Nao pode numero negativo");
        }

        sc.close();
    }
}
