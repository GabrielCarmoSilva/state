package entregas;

public class Entrega {
    private String nomeProduto;
    private String enderecoPartida;
    private String enderecoDestino;
    private EntregaEstado estado;

    public Entrega() {
        this.estado = EntregaEstadoPago.getInstance();
    }

    public void setEstado(EntregaEstado estado) {
        this.estado = estado;
    }

    public boolean pagar() {
        return estado.pagar(this);
    }

    public boolean separar() {
        return estado.separar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean sairParaEntrega() {
        return estado.sairParaEntrega(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean marcarComoAtrasado() {
        return estado.marcarComoAtrasado(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getEnderecoPartida() {
        return enderecoPartida;
    }

    public void setEnderecoPartida(String enderecoPartida) {
        this.enderecoPartida = enderecoPartida;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public EntregaEstado getEstado() {
        return estado;
    }
}
