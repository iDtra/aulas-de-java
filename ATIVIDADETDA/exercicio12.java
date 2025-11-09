import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        String inputSexo; 
        double salario;
        int somaIdadeTotal = 0;
        int contadorTotal = 0;
        double somaSalarioM = 0.0;
        int contadorM = 0;
        int contadorMulheresSalarioBaixo = 0;
        
        System.out.println("Digite os dados de cada pessoa. Idade negativa encerra.");

        System.out.print("Digite a idade (negativa para encerrar): ");
        if (!scanner.hasNextInt()) {
            System.out.println(" Entrada inválida. Esperada uma idade inteira.");
            scanner.close();
            return;
        }
        idade = scanner.nextInt();
        while (idade >= 0) {
            System.out.print("Digite o sexo (M/F): ");
            inputSexo = scanner.next().toUpperCase();
            
            System.out.print("Digite o salário (R$): ");
            if (!scanner.hasNextDouble()) {
                System.out.println(" Entrada inválida. Esperado um valor real para o salário.");
                break; 
            }
            salario = scanner.nextDouble();
            somaIdadeTotal += idade;
            contadorTotal++;
            char sexo = inputSexo.length() > 0 ? inputSexo.charAt(0) : ' ';
            if (sexo == 'M') {
                somaSalarioM += salario;
                contadorM++;     
            } else if (sexo == 'F') {
                if (salario < 600.00) {
                    contadorMulheresSalarioBaixo++;
                }
            } else {
                System.out.println(" Sexo não reconhecido (M/F). Os dados desta pessoa só entraram no cálculo da média de idade.");
            }
            System.out.print("Digite a idade da próxima pessoa (negativa para encerrar): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Esperada uma idade inteira.");
                break; 
            }
            idade = scanner.nextInt();
        }  
        scanner.close();  
        double mediaIdade = (contadorTotal > 0) ? (double) somaIdadeTotal / contadorTotal : 0.0;
        double mediaSalarioM = (contadorM > 0) ? somaSalarioM / contadorM : 0.0;
        System.out.println("Total de pessoas registradas: " + contadorTotal);
        
        System.out.printf("Média de idade do grupo: %.1f anos%n", mediaIdade);
        
        if (contadorM > 0) {
            System.out.printf("Média de salários dos homens: R$ %.2f%n", mediaSalarioM);
        } else {
            System.out.println("Média de salários dos homens: Não há dados de homens.");
        }
        
        System.out.println("Quantidade de mulheres com salário abaixo de R$600,00: " + contadorMulheresSalarioBaixo);
    }
}