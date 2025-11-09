import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tal = 20;
        final int tau = 60;
        final double freq = 0.75;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;

        double somaNotas = 0.0;
        double nota;
        int faltas;
        System.out.println("Desempenho da Turma (" + tal + " Alunos)");        for (int i = 1; i <= tal; i++) {
            System.out.println(" Aluno " + i );
            System.out.print("Digite a nota (0 a 10): ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println(" Nota inválida. Digite um valor entre 0 e 10.");
                    i--;
                    continue;
                }
            } else {
                System.out.println("Entrada inválida. Digite um número para a nota.");
                scanner.next();
                i--;
                continue;
            }   
            System.out.print("Digite o número de faltas (0 a " + tau + "): ");
            if (scanner.hasNextInt()) {
                faltas = scanner.nextInt();
                if (faltas < 0 || faltas > tau) {
                    System.out.println(" Número de faltas inválido.");
                    i--;
                    continue;
                }
            } else {
                System.out.println(" Entrada inválida. Digite um número inteiro para as faltas.");
                scanner.next(); 
                i--; 
                continue;
            }
            double frequencia = (tau - faltas) / (double)tau; 
            somaNotas += nota;
            if (frequencia < freq || nota < 3.0) {
                reprovados++;
                if (frequencia < freq) {
                    System.out.printf("Situação: REPROVADO (Frequência: %.2f%%)%n", frequencia * 100);
                } else {
                    System.out.println("Situação: REPROVADO (Nota < 3.0)");
                }
            } 
            else if (nota >= 6.0) {
                aprovados++;
                System.out.println("Situação: APROVADO");
            } 
            else { 
                exame++;
                System.out.println("Situação: EXAME");
            }
        }
        scanner.close();
        double mediaTurma = somaNotas / tal;
        System.out.println("Alunos Aprovados (Nota >= 6.0): " + aprovados);
        System.out.println("Alunos de Exame (Nota >= 3.0 e < 6.0): " + exame);
        System.out.println("Alunos Reprovados (Nota < 3.0 ou Freq < 75%): " + reprovados);
        System.out.printf("Média das Notas da Turma: %.2f%n", mediaTurma);
    }
}
