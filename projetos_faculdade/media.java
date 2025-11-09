
    
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in); 
     int n, q, m, a, media;   
    System.out.println ("Digite a nota 1:");
    n = teclado.nextInt();
    System.out.println("Digite nota 2:");
    q = teclado.nextInt();
    System.out.println("Digite nota 3:");
    m = teclado.nextInt();
    System.out.println("Digite nota 4:");
    a = teclado.nextInt();
    media = ( (n + q + m + a )/4 );
        if (media >= 6){
            System.out.println("Aprovado");

        }
        else {
            System.out.println("Reprovado");
        }
    // operador ternario
    System.out.println(media >= 6 ? "aprovado": "reprovado");
    
    }


}
