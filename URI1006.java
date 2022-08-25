import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,med;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        med = (a * 2 + b * 3 + c * 5) / 10;
        System.out.printf("MEDIA = %.1f%n", med);
        sc.close();

    }
}
