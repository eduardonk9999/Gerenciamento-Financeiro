public class Transacao {
    private double valor;
    private Date data;
    private String categoria;
    private String descricao;

    public Transacao(double valor, Date data, String categoria, String descricao){
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public double getValor() {
        return 0;          
    }
}   
