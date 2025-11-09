import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salario, pendencia;
        System.out.println("Digite o seu salario: ");
        salario = entrada.nextInt();


        if (salario >= 2500) {
            System.out.println("Digite o numero de pendencias : ");
            pendencia = entrada.nextInt();
            if (pendencia <= 2) {
                    System.out.println("Emprestimo aprovado!!!");
                    } else { 
            System.out.println("Emprestimo negado !!!");
        }  
        }  else { 
            System.out.println("Emprestimo negado !!!");
        }        
    }
}
