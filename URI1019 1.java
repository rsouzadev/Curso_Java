import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  N,horas, resto, minutos, segundos ;
        N = sc.nextInt();
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
        System.out.print(horas+":"+minutos+":"+segundos);




        sc.close();
    }
}
