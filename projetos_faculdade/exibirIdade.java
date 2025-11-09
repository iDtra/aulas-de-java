import java.util.Scanner;

public class exibirIdade {
    public static void main(String[] args) {
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        idade = teclado.nextInt();
        System.out.println("A idade é " + idade );
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
                        
        }
            else{
                System.out.println("Você é menor de idade");
                
            }
    }
}
