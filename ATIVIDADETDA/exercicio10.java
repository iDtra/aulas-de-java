import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altf = 0.0;
        int contf = 0;
        double altm = 0.0;
        int contm = 0;
        
        String sexoin; 
        double altura;

        System.out.println("Digite o sexo (M/F) ou 'S' para SAIR e ver os resultados.");
        
        System.out.print("Sexo: ");
        sexoin = teclado.next().toUpperCase();

        while (!sexoin.equals("S")) {
            
            char sexo = sexoin.charAt(0);
            if (sexo == 'F') {
                System.out.print("Digite a altura da mulher (em metros, ex: 1.65): ");
                if (teclado.hasNextDouble()) {
                    altura = teclado.nextDouble();
                    altf += altura;
                    contf++;
                } else {
                    System.out.println(" Entrada inválida para altura. Tente novamente.");
                    teclado.next();
                }
                
            } else if (sexo == 'M') {
                System.out.print("Digite a altura do homem (em metros, ex: 1.80): ");
                if (teclado.hasNextDouble()) {
                    altura = teclado.nextDouble();
                    altm += altura;
                    contm++;
                } else {
                    System.out.println(" Entrada inválida para altura. Tente novamente.");
                    teclado.next();
                }
                
            } else {
                System.out.println(" Sexo inválido. Digite M, F ou S para sair.");
            }
            System.out.print("Sexo (M/F/S): ");
            sexoin = teclado.next().toUpperCase();
        }
        
        teclado.close();

        if (contf > 0) {
            double mediaF = altf / contf;
            System.out.printf(" Média de altura das Mulheres (%d pessoas): %.2f metros%n", contf, mediaF);
        } else {
            System.out.println("Nenhuma mulher foi registrada.");
        }
        
        if (contm > 0) {
            double mediaM = altm / contm;
            System.out.printf(" Média de altura dos Homens (%d pessoas): %.2f metros%n", contm, mediaM);
        } else {
            System.out.println("Nenhum homem foi registrado.");
        }
        
    }
}