import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        String nome;
        double n1, n2, n3, n4, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do aluno");
        nome = teclado.nextLine();
        System.out.println("Qual a nota 1");
        n1 = teclado.nextDouble();
        System.out.println("Qual a nota 2");
        n2 = teclado.nextDouble();
        System.out.println("Qual a nota 3");
        n3 = teclado.nextDouble();
        System.out.println("Qual a nota 4");
        n4 = teclado.nextDouble();
        media = (n1 + n2 + n3 + n4 )/4;
        System.out.println("a media do Aluno " + nome + "é " + media );
        
    }
}
