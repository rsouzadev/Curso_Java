import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int maior_ab, maior_ac,maior_cb;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        maior_ab = (a+b+Math.abs(a-b)) / 2;
        maior_ac = (maior_ab+c+Math.abs(maior_ab-c)) / 2;
        System.out.println(maior_ac + " eh o maior");
        sc.close();
    }
}
