import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("A:");
        a = sc.nextInt();
        System.out.print("B:");
        b = sc.nextInt();
        if (a % b == 0 || b % a == 0 ){
            System.out.print("SÃO MULTIPLOS!");
        }
        else {
            System.out.print("NÂO SÃO MULTIPLOS!");
        }

        sc.close();
    }
}
