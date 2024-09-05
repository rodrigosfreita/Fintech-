import java.util.Date;

public class Transferencia extends Transacao {
    private Conta contaDestino;

    public Transferencia(String idTransacao, double valor, Date dataTransacao, Conta contaOrigem, Conta contaDestino, String descricao) {
        super(idTransacao, valor, dataTransacao, contaOrigem, descricao);
        this.contaDestino = contaDestino;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void efetuarTransferencia() {
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }
}