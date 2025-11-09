import java.util.Scanner;

public class area_triangulo {
    public static void main(String[] args) {
        int base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a altura do triangulo:");
        altura = teclado.nextInt();
        System.out.println("Qual a base do triangulo:");
        base = teclado.nextInt();
        System.out.println("a area do triangulo é :" + (base*altura)/2 );

    }
}
