import java.util.Scanner;

public class revestimento {
    public static void main(String[] args) {
        double ar, cmpt, vu;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a largura a ser revestida");
        ar = teclado.nextDouble();
        System.out.println("Qual o comprimento a ser revestido");
        cmpt = teclado.nextDouble();
        System.out.println("Qual o valor unitario da caixa");
        vu = teclado.nextDouble();

        System.out.println("para revestir a area de " + ar*cmpt +" sera necessario a quantidade de " +(ar*cmpt)/2.5 + " caixas e  valor é de " + vu*(ar*cmpt)/2.5);
    } 
}
