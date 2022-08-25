import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int cont_pares = 0;
        int cont_impares = 0;
        int cont_positivos = 0;
        int cont_negativos = 0;

        if (n1 % 2 == 0){
            cont_pares = cont_pares + 1;
        }
        if (n1 % 2 != 0){
            cont_impares = cont_impares + 1;
        }
        if (n1 > 0){
            cont_positivos = cont_positivos + 1;
        }
        if (n1 < 0){
            cont_negativos = cont_negativos + 1;
        }
        if (n2 % 2 == 0){
            cont_pares = cont_pares + 1;
        }
        if (n2 % 2 != 0){
            cont_impares = cont_impares + 1;
        }
        if (n2 > 0){
            cont_positivos = cont_positivos + 1;
        }
        if (n2 < 0){
            cont_negativos = cont_negativos + 1;
        }
        if (n3 % 2 == 0){
            cont_pares = cont_pares + 1;
        }
        if (n3 % 2 != 0){
            cont_impares = cont_impares + 1;
        }
        if (n3 > 0){
            cont_positivos = cont_positivos + 1;
        }
        if (n3 < 0){
            cont_negativos = cont_negativos + 1;
        }
        if (n4 % 2 == 0){
            cont_pares = cont_pares + 1;
        }
        if (n4 % 2 != 0){
            cont_impares = cont_impares + 1;
        }
        if (n4 > 0){
            cont_positivos = cont_positivos + 1;
        }
        if (n4 < 0){
            cont_negativos = cont_negativos + 1;
        }
        if (n5 % 2 == 0){
            cont_pares = cont_pares + 1;
        }
        if (n5 % 2 != 0){
            cont_impares = cont_impares + 1;
        }
        if (n5 > 0){
            cont_positivos = cont_positivos + 1;
        }
        if (n5 < 0){
            cont_negativos = cont_negativos + 1;
        }

        System.out.printf("%d valor(es) par(es)\n",cont_pares);
        System.out.printf("%d valor(es) impar(es)\n",cont_impares);
        System.out.printf("%d valor(es) positivo(s)\n",cont_positivos);
        System.out.printf("%d valor(es) negativo(s)\n",cont_negativos);

        sc.close();
    }
}
