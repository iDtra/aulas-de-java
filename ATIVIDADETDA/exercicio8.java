import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salario, pendencia, valor, parcela;
        double juros, vt, pcj;
        System.out.println("Digite o seu salario: ");
        salario = entrada.nextInt();


        if (salario >= 2500) {
            System.out.println("Digite o numero de pendencias : ");
            pendencia = entrada.nextInt();
            if (pendencia <= 2) {
                    System.out.println("Empréstimo aprovado!!!");
                    } else { 
            System.out.println("Empréstimo negado !!!");
        }  
        }  else { 
            System.out.println("Empréstimo negado !!!");
        } 
         System.out.println("Digite o valor do empréstimo R$: ");
         valor = entrada.nextInt();
         System.out.println("Digite o numero de parcelas: ");     
         parcela = entrada.nextInt();
         juros = valor * 0.9 * parcela/100;
         vt = valor +juros;
         pcj = vt / parcela;
         System.out.printf("Valor de cada parcela é R$: %.2f%n  " , pcj);
         System.out.printf("Valor total do finaciamento é R$: %.2f%n  ",vt);
         
    }
}
