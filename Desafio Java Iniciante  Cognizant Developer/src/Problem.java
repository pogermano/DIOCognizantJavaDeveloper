import java.io.IOException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        System.out.println("inicio ");
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();
        // Complete o If com a condição que soluciona o problema.

        if (A > N)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }

}