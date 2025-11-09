import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        int n, q;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        n = teclado.nextInt();
        q = n * n;
        System.out.println("O quadrado de " + n + " é " +q);


    }
}
