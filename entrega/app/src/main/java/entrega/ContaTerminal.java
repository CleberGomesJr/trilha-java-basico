package entrega;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite o valor total no banco: ");
        double saldo = scanner1.nextDouble();

        System.out.println("Digite o valor a ser solicitado: ");
        double valor_solicitado = scanner2.nextDouble();

        if (valor_solicitado > saldo){
            System.out.println("Saldo Insuficiente na conta");
        }else{
            saldo = saldo - valor_solicitado;
            System.out.printf("Saldo atual: %f", saldo);
        }
    }
}
