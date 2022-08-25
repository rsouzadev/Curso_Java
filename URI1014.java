import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int km;
        double litros,consumo;

        km = sc.nextInt();
        litros = sc.nextDouble();
        consumo = km / litros;
        System.out.printf("%.3f km/l%n", consumo);


        sc.close();

    }
}
