package entregas;

public class EntregaEstadoAtrasado extends EntregaEstado {
    private EntregaEstadoAtrasado() {};
    private static EntregaEstadoAtrasado instance = new EntregaEstadoAtrasado();
    public static EntregaEstadoAtrasado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atrasado";
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        return true;
    }

    public boolean entregar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        return true;
    }
}
