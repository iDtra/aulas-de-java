import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        double S = 0.0;
        System.out.print("Digite um valor N (inteiro e positivo) para o limite da soma: ");
        if (teclado.hasNextInt()) {
            n = teclado.nextInt();
            if (n <= 0) {
                System.out.println("Valor N inválido. O N deve ser um inteiro positivo.");
                teclado.close();
                return; 
            }
            for (int i = 1; i <= n; i++) {
                double termo = 1.0 / i;
                S = S + termo;    
                System.out.printf("Adicionando 1/%d (%.4f). S atual: %.4f%n", i, termo, S); 
            }
            System.out.printf("A soma S  (até 1/%d) é:%n", n);
            System.out.printf("S = %.4f%n", S);
        } else {
            System.out.println(" Entrada inválida. Você deve digitar um número inteiro.");
        }

        teclado.close();
    }
}