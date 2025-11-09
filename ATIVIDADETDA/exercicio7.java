import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v;
        int contp = 0;
        int contn = 0;
        
        double mv = Double.MAX_VALUE; 

        System.out.println("Análise de valores Reais");
        System.out.println("Digite valores reais para análise.");
        System.out.println(" Digite 0 para encerrar o programa e ver os resultados. ");
        System.out.print("Digite o primeiro valor: ");
        while (scanner.hasNextDouble()) {
            v = scanner.nextDouble();
            if (v == 0) {
                break;
            }
            if (v > 0) {
                contp++;
            } else if (v < 0) {
                contn++;
            }
            if (v < mv) {
                mv = v;
            }
            System.out.print("Próximo valor (ou 0 para encerrar): ");
        }
        

        scanner.close();

        int ttv = contp + contn;
        
        if (ttv > 0) {
            System.out.println("Total de Valores Lidos: " + ttv);
            System.out.println(" Valores Positivos: " + contp);
            System.out.println(" Valores Negativos: " + contn);
            System.out.println(" O Menor valor lido foi: " + mv);
        } else {
            System.out.println("Nenhum valor diferente de zero foi digitado.");
        }
    }
}