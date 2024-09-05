import java.util.Date;

public class Transacao {
    protected String idTransacao;
    protected double valor;
    protected Date dataTransacao;
    protected Conta contaOrigem;
    protected String descricao;

    public Transacao(String idTransacao, double valor, Date dataTransacao, Conta contaOrigem, String descricao) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
        this.contaOrigem = contaOrigem;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirDetalhesTransacao() {
        System.out.println("ID Transação: " + idTransacao);
        System.out.println("Data: " + dataTransacao);
        System.out.println("Valor: " + valor);
        System.out.println("Descrição: " + descricao);
    }
}