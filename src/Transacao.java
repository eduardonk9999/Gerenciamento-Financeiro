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

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
