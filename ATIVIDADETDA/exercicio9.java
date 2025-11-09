import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double alturaCm; 
        double alturaM; 
        char sexo;

        double imc;
        String condicao = "";

        System.out.println("=== Calculadora de Índice de Massa Corporal (IMC) ===");
        

        System.out.print("Digite o peso (em kg, ex: 75,5): ");
        if (teclado.hasNextDouble()) {
            peso = teclado.nextDouble();
        } else {
            System.out.println("Erro: Peso inválido.");
            teclado.close();
            return;
        }
        System.out.print("Digite a altura (em centímetros, ex: 175): ");
        if (teclado.hasNextDouble()) {
            alturaCm = teclado.nextDouble();
        } else {
            System.out.println("Erro: Altura inválida.");
            teclado.close();
            return;
        }
        System.out.print("Digite o sexo (M para Masculino / F para Feminino): ");
        String inputSexo = teclado.next().toUpperCase();
        if (inputSexo.length() > 0) {
            sexo = inputSexo.charAt(0);
        } else {
            System.out.println("Erro: Sexo não informado.");
            teclado.close();
            return;
        }
        if (alturaCm > 0) {
            alturaM = alturaCm / 100.0;
        } else {
            System.out.println("Erro: Altura deve ser maior que zero.");
            teclado.close();
            return;
        }
        imc = peso / (alturaM * alturaM);
        
        if (sexo == 'F') {
            if (imc < 19.1) {
                condicao = "abaixo do peso";
            } else if (imc <= 25.8) {
                condicao = "no peso normal";
            } else if (imc <= 27.3) { 
                condicao = "marginalmente acima do peso";
            } else if (imc <= 32.3) {
                condicao = "acima do peso ideal";
            } else {
                condicao = "Obeso";
            }
        } else if (sexo == 'M') {
            if (imc < 20.7) {
                condicao = "abaixo do peso";
            } else if (imc <= 26.4) {
                condicao = "no peso normal";
            } else if (imc <= 27.8) { 
                condicao = "marginalmente acima do peso";
            } else if (imc <= 31.1) { 
                condicao = "acima do peso ideal";
            } else {
                condicao = "Obeso";
            }
        } else {
            condicao = "Sexo não reconhecido.";
        }

        System.out.printf("O IMC calculado é: %.2f%n", imc);
        System.out.println( "A condição é: " + condicao);

    }
}