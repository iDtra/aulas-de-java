import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float peso, altura;
        System.out.println("Qual sua altura");
        altura = teclado.nextFloat();
        System.out.println("qual seu peso ");
        peso = teclado.nextFloat();
        System.out.println("O imc é de :"+ peso/(altura*altura)+ "kg/m²");


    }
}
