import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c){
            if (b < c){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println();
            }
            else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
                System.out.println();
            }
        }
        else if (b < a && b < c){
            if (a < c){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
                System.out.println();
            }
            else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
                System.out.println();
            }
        }
        else if(c < a && c < b) {
            if (b < a){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
                System.out.println();
            }
            else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
                System.out.println();
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
