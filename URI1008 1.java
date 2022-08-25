import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cf;
        double vh,ht,sal;
        cf = sc.nextInt();
        ht = sc.nextDouble();
        vh = sc.nextDouble();
        sal = ht * vh;
        System.out.println("NUMBER = " + cf);
        System.out.printf("SALARY = U$ %.2f", sal);
        sc.close();
    }
}
