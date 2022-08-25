import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tempo_horas,veloc_media_km;
        double litros;

        tempo_horas = sc.nextInt();
        veloc_media_km = sc.nextInt();

        litros = (double) tempo_horas * veloc_media_km / 12;
        System.out.printf("%.3f%n", litros);


        sc.close();
    }
}
