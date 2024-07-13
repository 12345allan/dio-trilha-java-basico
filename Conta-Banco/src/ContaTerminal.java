import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {

                Scanner scanner = new Scanner(System.in);
        
                // Solicitar e ler os dados da conta bancária
                System.out.println("Por favor, digite o número da Agência:");
                String agencia = scanner.nextLine();
        
                System.out.println("Agora, digite o número da Conta:");
                int numeroConta = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()
        
                System.out.println("Por favor, digite o nome do cliente:");
                String nomeCliente = scanner.nextLine();
        
                System.out.println("Finalmente, digite o saldo da conta:");
                double saldo = scanner.nextDouble();
        
                // Fechar o scanner
                scanner.close();
        
                // Exibir os dados da conta bancária
                System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
                System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldo + ".");
            }
        
        
    }

