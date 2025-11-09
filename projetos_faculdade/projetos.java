
import java.util.Scanner;

public class projetos {
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in); 
     int n, q, m, a;   
    System.out.println ("Digite a nota 1:");
    n = teclado.nextInt();
    System.out.println("Digite nota 2:");
    q = teclado.nextInt();
        System.out.println("Digite nota 3:");
    m = teclado.nextInt();
        System.out.println("Digite nota 4:");
    a = teclado.nextInt();

    System.out.println("A media do Aluno foi:" + (n + q + m + a )/4);
    }

}