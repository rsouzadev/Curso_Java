import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pw = 0;
        System.out.print("Please insert the password:");
        pw = sc.nextInt();
        while (pw != 2002){
            System.out.print("Wrong password! Please retype it...:");
            pw = sc.nextInt();
        }
        System.out.print("ACCESS GRANTED!");
        sc.close();







    }
}
