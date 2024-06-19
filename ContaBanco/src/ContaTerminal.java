import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o número de Usuário: ");
        numero = input.nextInt();


        System.out.println("Por favor, digite seu saldo: ");
        saldo = input.nextDouble();


        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta no nosso banco. Sua Agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está desponível para saque");


    }


}