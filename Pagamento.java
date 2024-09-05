import java.util.Date;

public class Pagamento extends Transacao {

    public Pagamento(String idTransacao, double valor, Date dataTransacao, Conta contaOrigem, String descricao) {
        super(idTransacao, valor, dataTransacao, contaOrigem, descricao);
    }

    public void realizarPagamento() {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            System.out.println("Pagamento de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }
}