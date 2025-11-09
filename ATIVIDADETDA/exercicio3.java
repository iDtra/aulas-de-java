import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double valor, desconto, precof;
        System.out.println("Qual o valor do produto: ");
        valor = entrada.nextDouble();
        desconto = valor * 10 /100;
        precof = valor - desconto;
        System.out.println("valor com desconto:" + precof); 
    }
}
