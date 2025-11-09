import java.util.Scanner;

public class area_retangulo {
public static void main(String[] args) {
    int base, altura;
    Scanner teclado = new Scanner(System.in);
    System.out.println("qual o valor da base:");
    base = teclado.nextInt();
    System.out.println("Qual é o valor da altura:");
    altura = teclado.nextInt();
    System.out.println("o Area do retangulo é de "+ base*altura );
}
    
}