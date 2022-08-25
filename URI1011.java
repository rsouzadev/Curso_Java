import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi, raio,volume;
        pi = 3.14159;
        raio = sc.nextDouble();
        volume = (4.0/3.0) * pi * Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f%n", volume);
        sc.close();
    }

}
