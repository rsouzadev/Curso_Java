import java.util.Scanner;

public class URI1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d,d1,d2,h,h1,h2,m,m1,m2,s,s1,s2,inicio,fim,duracao,resto;

        System.out.print("DIA:");
        d1 = sc.nextInt();
        System.out.print("HORAS:");
        h1 = sc.nextInt();
        System.out.print("MINUTOS:");
        m1 = sc.nextInt();
        System.out.print("SEGUNDOS:");
        s1 = sc.nextInt();

        System.out.print("DIA:");
        d2 = sc.nextInt();
        System.out.print("HORAS:");
        h2 = sc.nextInt();
        System.out.print("MINUTOS:");
        m2 = sc.nextInt();
        System.out.print("SEGUNDOS:");
        s2 = sc.nextInt();

        inicio = d1*24*60*60 + h1*60*60 +m1*60 + s1;
        fim = d2*24*60*60 + h2*60*60 +m2*60 + s2;
        duracao = fim - inicio;

        d = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        h = resto / (60*60);
        resto = resto % (60*60);
        m = resto / 60;
        s = resto % 60;
        sc.close();
        System.out.println(d + " dia(s)");
        System.out.println(h + " hora(s)");
        System.out.println(m + " minuto(s)");
        System.out.println(s + " segundo(s)");




    }
}
