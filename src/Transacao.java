
import java.util.Date;

public class Transacao {
    private String tipo;
    private double valor;
    private Date data;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(String tipo, double valor, Date data, Conta contaOrigem, Conta contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }
}
