import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int dist,total_min;

        dist = sc.nextInt();
        total_min = 2 * dist;

        System.out.println(total_min + " minutos");
        sc.close();
    }
}
