import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        while (true) {
            System.out.print("\nDigite o número da conta (ou digite 'sair' para finalizar): ");
            String numeroConta = scanner.nextLine();
            if (numeroConta.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o saldo inicial da conta: ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Digite o tipo de conta (Corrente/Poupança): ");
            String tipoConta = scanner.nextLine();
            Conta conta = new Conta(numeroConta, saldoInicial, tipoConta, nomeCliente);
            cliente.adicionarConta(conta);
        }

        while (true) {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Exibir informações do cliente e saldos das contas");
            System.out.println("2. Realizar transferência entre contas");
            System.out.println("3. Realizar pagamento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                cliente.exibirInformacoesCliente();
            } else if (opcao == 2) {
                System.out.print("\nDigite o número da conta de origem: ");
                String numeroContaOrigem = scanner.nextLine();
                Conta contaOrigem = cliente.buscarContaPorNumero(numeroContaOrigem);
                System.out.print("Digite o número da conta de destino: ");
                String numeroContaDestino = scanner.nextLine();
                Conta contaDestino = cliente.buscarContaPorNumero(numeroContaDestino);
                if (contaOrigem != null && contaDestino != null) {
                    System.out.print("Digite o valor a ser transferido: ");
                    double valorTransferencia = scanner.nextDouble();
                    scanner.nextLine();
                    Transferencia transferencia = new Transferencia("TX" + System.currentTimeMillis(), valorTransferencia, new Date(), contaOrigem, contaDestino, "Transferência");
                    transferencia.efetuarTransferencia();
                } else {
                    System.out.println("Conta de origem ou destino não encontrada.");
                }
            } else if (opcao == 3) {
                System.out.print("\nDigite o número da conta para realizar o pagamento: ");
                String numeroConta = scanner.nextLine();
                Conta conta = cliente.buscarContaPorNumero(numeroConta);
                if (conta != null) {
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a descrição do pagamento: ");
                    String descricaoPagamento = scanner.nextLine();
                    Pagamento pagamento = new Pagamento("PG" + System.currentTimeMillis(), valorPagamento, new Date(), conta, descricaoPagamento);
                    pagamento.realizarPagamento();
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                scanner.close();
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}