package entregas;

public class EntregaEstadoSaiuParaEntrega extends EntregaEstado {
    private EntregaEstadoSaiuParaEntrega() {};
    private static EntregaEstadoSaiuParaEntrega instance = new EntregaEstadoSaiuParaEntrega();
    public static EntregaEstadoSaiuParaEntrega getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Saiu Para Entrega";
    }

    public boolean entregar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        return true;
    }

    public boolean marcarComoAtrasado(Entrega entrega) {
        entrega.setEstado(EntregaEstadoAtrasado.getInstance());
        return true;
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        return true;
    }
}
