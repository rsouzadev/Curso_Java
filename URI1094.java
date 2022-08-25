import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //num de testes
        int n = sc.nextInt();


        int qtd_coelhos=0;
        int qtd_ratos=0;
        int qtd_sapos=0;

        for (int i=0;i<n;i++){
            //Quantia de cobaias
            int quantia=sc.nextInt();
            char tipo = sc.next().charAt(0);

            if (tipo == 'C'){
                qtd_coelhos = qtd_coelhos + quantia;
            }
            else if (tipo == 'R'){
                qtd_ratos = qtd_ratos + quantia;
            }
            else {
                qtd_sapos = qtd_sapos + quantia;
            }
        }
        int qtd_cobaias=qtd_coelhos+qtd_sapos+qtd_ratos;
        double perc_coelhos = (double) qtd_coelhos / qtd_cobaias *100;
        double perc_ratos = (double) qtd_ratos / qtd_cobaias *100;
        double perc_sapos = (double) qtd_sapos / qtd_cobaias *100;

        System.out.println("Total: " + qtd_cobaias + " cobaias");
        System.out.println("Total de coelhos: " + qtd_coelhos);
        System.out.println("Total de ratos: " + qtd_ratos);
        System.out.println("Total de sapos: " + qtd_sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n",perc_coelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n",perc_ratos);
        System.out.printf("Percentual de sapos: %.2f %%%n",perc_sapos);

        sc.close();
    }
}
