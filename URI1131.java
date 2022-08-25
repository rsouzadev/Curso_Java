import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int cont = 0;
        int soma_gremio = 0;
        int soma_inter = 0;
        int empate = 0;
        while (opcao == 1){
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            cont = cont + 1;
            if (inter > gremio){
                soma_inter = soma_inter + 1;
            }
            else if (gremio > inter){
                soma_gremio = soma_gremio + 1;
            }
            if (inter == gremio){
                empate = empate + 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();
            while (opcao != 1 && opcao != 2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                opcao = sc.nextInt();
            }
        }
        System.out.println(cont + " grenais");
        System.out.println("Inter:" + soma_inter);
        System.out.println("Gremio:" + soma_gremio);
        System.out.println("Empates:" + empate);
        if (soma_gremio > soma_inter){
            System.out.println("Gremio venceu mais");
        }
        else if (soma_inter > soma_gremio){
            System.out.println("Inter venceu mais");
        }
        else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}
