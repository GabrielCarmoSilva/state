package entregas;

public class EntregaEstadoEnviado extends EntregaEstado {
    private EntregaEstadoEnviado() {};
    private static EntregaEstadoEnviado instance = new EntregaEstadoEnviado();
    public static EntregaEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean sairParaEntrega(Entrega entrega) {
        entrega.setEstado(EntregaEstadoSaiuParaEntrega.getInstance());
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
