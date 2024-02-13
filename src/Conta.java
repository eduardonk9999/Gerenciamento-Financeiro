import java.util.ArrayList;
import java.util.List;

public class Conta {
    private double saldo;
    private List<Transacao> transacaos;

    //Construtor
    public Conta(){
        this.saldo = 0.0;
        this.transacaos = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarTransacao(Transacao transacao) {
        transacaos.add(transacao);
        saldo += transacao.getValor();
    }

    public List<Transacao> getTransacaos() {
        return transacaos;
    }

    public double calcularSaldo() {
        double saldoCalculado = 0.0;
        for(Transacao transacao: transacaos) {
            saldoCalculado += transacao.getValor();
        }
        return saldoCalculado;
    }

    // Outros métodos úteis, como gerar relatório de transações, etc.
}
