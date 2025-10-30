package entregas;

public class EntregaEstadoPago extends EntregaEstado {
    private EntregaEstadoPago() {};
    private static EntregaEstadoPago instance = new EntregaEstadoPago();
    public static EntregaEstadoPago getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }

    public boolean separar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoSeparado.getInstance());
        return true;
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelado.getInstance());
        return true;
    }
}
