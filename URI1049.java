import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipo_animal1 = sc.nextLine();
        String tipo_animal2 = sc.nextLine();
        String tipo_animal3 = sc.nextLine();

        if (tipo_animal1.equals("vertebrado")){
            if (tipo_animal2.equals("ave")){
                if (tipo_animal3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                if (tipo_animal2.equals("mamifero")){
                    if (tipo_animal3.equals("onivoro")){
                        System.out.println("homem");
                    }
                    else {
                        System.out.println("vaca");
                    }
                }
            }
        }
        else {
            if (tipo_animal1.equals("invertebrado")){
                if (tipo_animal2.equals("inseto")){
                    if (tipo_animal3.equals("hematofago")){
                        System.out.println("pulga");
                    }
                    else {
                        System.out.println("lagarta");
                    }
                }
                else {
                    if (tipo_animal2.equals("anelideo")){
                        if (tipo_animal3.equals("hematofago")){
                            System.out.println("sanguessuga");
                        }
                        else {
                            System.out.println("minhoca");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
