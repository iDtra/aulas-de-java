import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int escolha;
        String lanche ="";
        double preco = 0;
        System.out.println("[1]- Hambúrguer (R$ 10)");
        System.out.println("[2]- Cachorro-quente (R$ 7)");
        System.out.println("[3]- Batata Frita (R$ 5)");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha seu lanche: ");
        escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                lanche = "Hambúrguer";
                preco = 10;
                break;
            case 2:
                lanche = "Cachorro-quente";
                preco = 7;
                break;
            case 3:
                lanche = "Batata frita";
                preco = 5;
                break;        
            default:
            System.out.println("Opção invalida! Por favor, Selecione um lanche válido ");
                break;
        }
        if (escolha >= 1 && escolha <=3) {
            System.out.println("Você escolheu:" + lanche);
            System.out.printf("Valor a pagar : R$ ", preco);
            System.out.println("Obrigado pela preferência, Volte sempre!!!");
            
        } else {
        }
    }
}
