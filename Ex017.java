import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.print("X:");
        x = sc.nextInt();
        System.out.print("Y:");
        y = sc.nextInt();


        while(x !=0 && y !=0){
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }

            else {
                System.out.println("quarto");
            }
            System.out.print("X:");
            x = sc.nextInt();
            System.out.print("Y:");
            y = sc.nextInt();

        }

        sc.close();
    }
}
