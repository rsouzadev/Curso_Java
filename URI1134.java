import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo_combs = sc.nextInt();
        int alc = 0;
        int gas = 0;
        int die = 0;

        while (tipo_combs != 4){
            if (tipo_combs == 1){
                alc = alc + 1;
            }
            else if (tipo_combs == 2){
                gas = gas + 1;
            }
            else if (tipo_combs == 3){
                die = die + 1;
            }
            tipo_combs = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);
        sc.close();
    }
}
