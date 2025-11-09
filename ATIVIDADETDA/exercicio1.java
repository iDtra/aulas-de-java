import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Double km, cons, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a distancia total percorrida ( em km ): ");
        km = teclado.nextDouble();
        System.out.println("Quantos litros foram gasto nessa viagem (em litros):");
        cons = teclado.nextDouble();
        media = km / cons;
        System.out.println("Consumo medio do veiculo: "+media+ " km/l");

    }
}
